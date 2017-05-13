package ro.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ro.service.User;


@WebServlet("/AddingController")
public class AddingController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User u = (User)	request.getSession().getAttribute("user");
		
		String amountOfMoney = request.getParameter("amountOfMoney");
		double amount = Double.parseDouble(amountOfMoney);
		u.getAccount().depositMoney(amount);
	//	PrintWriter out = response.getWriter();
		//out.println(u);
//		out.println("Your current balance is : "+u.getAccount().getBalance());
		
		 request.getRequestDispatcher("/welcome.jsp").forward(request, response);
		
		
		
	}

}
