package com.light.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.light.service.impl.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String pwd = request.getParameter("password");
		
		try {
				LoginServiceImpl loginServiceImpl = new LoginServiceImpl();
				loginServiceImpl.login(userName, pwd);
				System.out.println("跳转主页");
		} catch (Exception e) {
			System.out.println("调回页面，返回错误信息");
		}
	}

}
