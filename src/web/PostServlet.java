package web;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Post;

/**
 * Servlet implementation class PostServlet
 */
@WebServlet("/PostServlet")
public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PostDAO postDAO;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PostServlet() {
		super();
		postDAO = new PostDAO();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Setting it to avoid inserting data to mysql char-set problem
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String action = request.getParameter("action");
		try {
			switch (action) {
			case "new":
				showNewForm(request, response);
				break;
			case "edit":
				showEditForm(request, response);
				break;
			case "insert":
				insertNewPost(request, response);
				break;
			case "update":
				updatePost(request, response);
				break;
			case "delete":
				deletePost(request, response);
				break;
			case "detail":
				showPost(request, response);
				break;
			case "listReleased":
				listReleasedPost(request, response);
				break;
			case "listAllPost":
				listAllPost(request, response);
				break;
			}
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			listReleasedPost(request, response);
		}
			

	}

	private void deletePost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (isAuthorized(request)) {
			long id = Long.parseLong(request.getParameter("id"));
			postDAO.deletePost(new Post(id));
			listReleasedPost(request, response);
		} else {
			listReleasedPost(request, response);
		}
	}

	// avoid sql query injection
	private boolean isAuthorized(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return request.getSession().getAttribute("isLogedIn") != null;
	}

	private void listReleasedPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Post> listRelease = postDAO.getReleasedPosts();
		if (listRelease != null && !listRelease.isEmpty()) {
			listRelease.sort(Comparator.comparing(Post::getPostTime).reversed());
		}
		request.setAttribute("listPost", listRelease);
		request.getRequestDispatcher("posts.jsp").forward(request, response);
	}

	private void listAllPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Post> listPost = postDAO.getAllPost();
		if (listPost != null && !listPost.isEmpty()) {
			listPost.sort(Comparator.comparing(Post::getPostTime).reversed());
		}
		request.setAttribute("listPost", listPost);
		request.getRequestDispatcher("posts.jsp").forward(request, response);
	}

	private void showPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		long id = Long.parseLong(request.getParameter("id"));
		Post post = postDAO.getPost(id);
		request.setAttribute("post", post);
		request.getRequestDispatcher("postDetail.jsp").forward(request, response);
	}

	private void updatePost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		if (isAuthorized(request)) {
			long id = Long.parseLong(request.getParameter("id"));
			String title = request.getParameter("title");
			String topic = request.getParameter("topic");
			String content = request.getParameter("content");
			boolean isRelease = request.getParameter("isRelease") != null;

			Post post = new Post(id, title, topic, content, isRelease);
			postDAO.updatePost(post);
			listReleasedPost(request, response);
		} else {
			listReleasedPost(request, response);
		}

	}

	private void insertNewPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		if (isAuthorized(request)) {
			String title = request.getParameter("title");
			String topic = request.getParameter("topic");
			String content = request.getParameter("content");
			String author = (String) request.getSession().getAttribute("logedinUser");
			boolean isRelease = request.getParameter("isRelease") != null;

			Post post = new Post(title, topic, content, author, isRelease);
			postDAO.saveNewPost(post);
			listReleasedPost(request, response);
		} else {
			listReleasedPost(request, response);
		}

	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (isAuthorized(request)) {
			long id = Long.parseLong(request.getParameter("id"));
			Post post = postDAO.getPost(id);
			request.setAttribute("isEdit", true);
			request.setAttribute("post", post);
			request.getRequestDispatcher("editor.jsp").forward(request, response);
		} else {
			listReleasedPost(request, response);
		}

	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (isAuthorized(request)) {
			request.setAttribute("isEdit", false);
			request.setAttribute("post", new Post());
			request.getRequestDispatcher("editor.jsp").forward(request, response);
		} else {
			listReleasedPost(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
