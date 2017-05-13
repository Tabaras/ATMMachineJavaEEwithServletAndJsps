package ro.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ro.service.LoginService;
import ro.service.User;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		HttpSession session = request.getSession();
		User newUser = new User();
		LoginService service = new LoginService();
		service.initUsers();
	
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String emailAddress = request.getParameter("emailAddress");
		
		newUser.setUserName(userName);
		newUser.setPassword(password);
		newUser.setEmailAddress(emailAddress);
		LoginService.users.add(newUser);
		session.setAttribute("userName", userName);
		session.setAttribute("password", password);
		session.setAttribute("emailAdress", emailAddress);
		System.out.println("ArrayList size is: " + LoginService.users.size());
		/*for(User e: LoginService.users){
			System.out.print(e+ " ");
		}*/
	
			RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
			dispatcher.forward(request, response);
		
		
	}

}
