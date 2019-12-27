package web;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Post;
import util.HibernateUtil;

public class PostDAO {

	@SuppressWarnings("unchecked")
	public List<Post> getAllPost() {
		// TODO Auto-generated method stub
		Transaction transaction = null;
		List<Post> listPosts = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start transaction
			transaction = session.beginTransaction();
			listPosts = session.createQuery("from Post").list();
			// commit transaction
			transaction.commit();
		} catch (Exception e) {

			e.printStackTrace();
		}

		return listPosts;
	}

	public Post getPost(long id) {
		// TODO Auto-generated method stub
		Transaction transaction = null;
		Post post = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start transaction
			transaction = session.beginTransaction();
			// get Post
			post = session.get(Post.class, id);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}

		return post;
	}

	public void updatePost(Post post) {
		// TODO Auto-generated method stub
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start transaction
			transaction = session.beginTransaction();
			session.update(post);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

	}

	public void saveNewPost(Post post) {
		// TODO Auto-generated method stub
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start transaction
			transaction = session.beginTransaction();
			// get Post
			session.save(post);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	public List<Post> getReleasedPosts() {
		Transaction transaction = null;
		List<Post> listPosts = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start transaction
			transaction = session.beginTransaction();
			listPosts = session.createQuery("from Post P where P.isRelease = 1").getResultList();
			// commit transaction
			transaction.commit();
		} catch (Exception e) {

			e.printStackTrace();
		}

		return listPosts;
	}

	public void deletePost(Post post) {
		// TODO Auto-generated method stub
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start transaction
			transaction = session.beginTransaction();
			session.delete(post);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

	}

}
