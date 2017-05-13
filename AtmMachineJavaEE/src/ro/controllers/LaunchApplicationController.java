package ro.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LaunchApplicationController")
public class LaunchApplicationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String action = request.getParameter("action");
	String page = null;
	
	switch(action) {
	case "login":
		page = "/login.jsp";
		break;
	case "register":
		page = "/register.jsp";
		break;
	case "addMoney":
		page = "/addmoney.jsp";
		break;
	case "withdrawMoney":
		page = "/withdrawMoney.jsp";
		break;
	}
	/*if(action.equals("login")) {
		page = "/login.jsp";
	} else if(action.equals("register")) {
		page = "/register.jsp";
	}else if(action.equals("addMoney")) {
		page = "/addmoney.jsp";
	} else if(action.equals("withdrawMoney")) {
		page = "/withdrawMoney.jsp";
	}*/
	
	getServletContext().getRequestDispatcher(page).forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
