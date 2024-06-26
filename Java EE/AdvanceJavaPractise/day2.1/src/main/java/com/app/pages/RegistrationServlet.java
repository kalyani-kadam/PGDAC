package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.UserDaoImpl;
import com.app.entities.User;

/**
 * Servlet implementation class RegistrationServlet
 */
//@WebServlet("/registration")
@WebServlet(value = "/registration", loadOnStartup = 1)
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDaoImpl userDao;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		System.out.println("in init of"+getClass());
		
		try{
			userDao = new UserDaoImpl();
		}catch(Exception e) {
			throw new ServletException("error in init -"+getClass(),e);
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			userDao.cleanUp();
		}catch(Exception e) {
			System.out.println("error in destroy -"+getClass());
		}
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter pw = response.getWriter()) {
			String firstname = request.getParameter("fn");
			String lastname = request.getParameter("ln");
			String email = request.getParameter("em");
			String password = request.getParameter("pass");
			String dob = request.getParameter("dob");
			
			LocalDate date = LocalDate.parse(dob);
			Period a = Period.between(date, LocalDate.now());
			int age = a.getYears();
			if(age<21) {
				pw.print("Invalid age");
			}else {
				User usr = new User(firstname,lastname,email,password,Date.valueOf(date));
//				boolean user=userDao.voterRegistration(usr);
//				if(user ) {
//					pw.print("<h3>User registered succesfully!!<a href='login.html'>Login</a></h3>");
//				}else {
//					pw.print("<h3>User not registered!!<a href='registration.html'>Retry</a></h3>");
//				}
				
				try {
					userDao.voterRegistration(usr);
					pw.print("<h3>User registered succesfully!!<a href='login.html'>Login</a></h3>");
				} catch (SQLException e) {
					pw.print("<h3>User not registered!!<a href='registration.html'>Retry</a></h3>");
//					e.printStackTrace();
				}
			}
		}
		catch (Exception e) {
			// inform the WC about the exc
			throw new ServletException("err in servicing " + getClass(), e);
		}
//			catch(Exception e) {
//				System.out.println("<h3>User not registered!!<a href='registration.html'>Retry</a></h3>");
////			pw.print("<h3>User not registered!!<a href='registration.html'>Retry</a></h3>");
//			response.sendRedirect("registration");
////			throw new ServletException("User not registered!!"+getClass(),e);
//		}
//		doGet(request, response);
	}

}
