package ro.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ro.service.Account;
import ro.service.LoginService;
import ro.service.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		LoginService service = new LoginService();
		Account acc = new Account();
		acc.setBalance(500.00);
		acc.setCurrency("Eur");
		service.initUsers();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		// request.setAttribute("userName", userName);

		boolean b = service.validate(userName, password, LoginService.users);
		User currentUser = LoginService.users.get(LoginService.count);
		currentUser.setAccount(acc);
		System.out.println("CurrentUser is: " + currentUser);
		System.out.println("Boolean value is: " + b);
		session.setAttribute("user", currentUser);

		if (b == true) {
			// getServletContext().getRequestDispatcher(page).forward(request,
			// response);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/welcome.jsp");
			dispatcher.forward(request, response);

		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);
		}

	}

}
