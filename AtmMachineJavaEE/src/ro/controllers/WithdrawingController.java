package ro.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ro.service.User;


@WebServlet("/WithdrawingController")
public class WithdrawingController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User u = (User)	request.getSession().getAttribute("user");
		String amount = request.getParameter("substract");
		
		double withdrawAmount = Double.parseDouble(amount);
		u.getAccount().withdrawMoney(withdrawAmount);
		
		if(u.getAccount().getBalance() < withdrawAmount) {
			request.getRequestDispatcher("/notenoughfunds.jsp").forward(request, response);
		} else {
	//	request.setAttribute("userAccount", u.getAccount().getBalance());
		 request.getRequestDispatcher("/welcome.jsp").forward(request, response);
		
		}
		
	}

}
