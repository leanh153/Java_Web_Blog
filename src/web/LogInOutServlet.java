package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LogInOutServlet")
public class LogInOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogInOutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		try {
			switch (action) {
			case "dologin":
				processLogin(request, response);
				break;
			case "dologout":
				doLogout(request, response);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("posts.jsp");
		}
			
	}

	
	private void processLogin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		

		if (userName.equalsIgnoreCase("leanh") && password.equals("leanh")) {
			request.setAttribute("userName", "");
			request.setAttribute("password", "");
			request.setAttribute("errorMessage", "");
			// signed in user using session to store info
			HttpSession session = request.getSession();
			session.setAttribute("logedinUser", userName);
			session.setAttribute("isLogedIn", true);
			request.getRequestDispatcher("/posts.jsp").forward(request, response);

		} else {
			request.setAttribute("userName", userName);
			request.setAttribute("password", password);
			request.setAttribute("errorMessage", "Sai tên người dùng/mật khẩu!");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}

	private void doLogout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		if (request.getSession(false) != null && request.getSession().getAttribute("logedinUser")!=null) {
			request.getSession(false).invalidate();
			response.sendRedirect(request.getContextPath() + "/posts.jsp");
		}
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
