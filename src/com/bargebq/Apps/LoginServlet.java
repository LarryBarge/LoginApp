package com.bargebq.Apps;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bargebq.Apps.Service.LoginService;
import com.bargebq.Apps.dto.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login") //url mapping.
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId,password,passPhrase;
		
		userId = request.getParameter("userId");
		password = request.getParameter("password");
		passPhrase = request.getParameter("special");
		
		LoginService loginService = new LoginService();
		
		boolean result = loginService.authenticate(userId, password);
		if (result){
			
			User user = loginService.setUserDetails(userId, passPhrase);
			request.setAttribute("user", user);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
			//response.sendRedirect("success.jsp");
			return;
		}
		else {
			response.sendRedirect("Login.jsp");
			return;
		}
	 }
	
	
}
