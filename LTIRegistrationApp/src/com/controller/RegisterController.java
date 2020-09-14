package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.model.Register;
import com.dao.*;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegisterController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int regno = Integer.parseInt(request.getParameter("regno"));
		String fname = request.getParameter("fname");
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		float bal = Float.parseFloat(request.getParameter("bal"));
		
		Register r = new Register(regno,fname,uname,pass,bal);
		Registerdao dao = new Registerdao();
		int i = dao.createData(r);
		if(i>0)
		{
			response.sendRedirect("Login.html");
		}
		else
		{
			response.sendRedirect("Registration.html");
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
