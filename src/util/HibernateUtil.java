package util;

import java.util.Properties;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import model.Post;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	// use this instead of hibernate.cfg.xml file
	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();
				Properties properties = new Properties();
				// driver
				properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
				// url of database
				properties.put(Environment.URL, "jdbc:mysql://localhost:3306/project4?useSSL=false");
				// user
				properties.put(Environment.USER, "leanh");
				// password
				properties.put(Environment.PASS, "leanh");
				properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				properties.put(Environment.SHOW_SQL, true);
				properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				properties.put(Environment.HBM2DDL_AUTO, "update");
				properties.put(Environment.HBM2DDL_CREATE_SCHEMAS, true);
				properties.put(Environment.AUTOCOMMIT, true);
				

				configuration.setProperties(properties);
				
				configuration.addAnnotatedClass(Post.class);
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();

				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Exception e) {
				e.printStackTrace();
				
			}

		}
		return sessionFactory;
	}
}
