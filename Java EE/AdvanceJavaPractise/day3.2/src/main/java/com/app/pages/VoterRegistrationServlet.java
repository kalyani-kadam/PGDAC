package com.app.pages;

import static com.app.utils.DBUtils.closeConnection;
import static com.app.utils.DBUtils.openConnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.UserDaoImpl;
import com.app.entities.User;

/**
 * Servlet implementation class VoterRegistrationServlet
 */
//@WebServlet("/voter_register")
public class VoterRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDaoImpl userDao;

	@Override
	public void destroy() {
		try {
			userDao.cleanUp();
			closeConnection();
		}catch(Exception e) {
			System.out.println("error in destroy"+getClass());
		}
	}

	@Override
	public void init() throws ServletException {
		ServletConfig config = getServletConfig();
		System.out.println("in init of " + getClass()+" cofig "+config);//not null
		try {
			//open db connection once
			openConnection(config.getInitParameter("db_url"),
					config.getInitParameter("user_name"),
					config.getInitParameter("password"));
			userDao = new UserDaoImpl();
//			candidateDao=new CandidateDaoImpl();
		} catch (Exception e) {
			throw new ServletException("err in init - " + getClass(), e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter pw = response.getWriter()){
			String firstname = request.getParameter("fn");
			String lastname = request.getParameter("ln");
			String email = request.getParameter("em");
			String password = request.getParameter("pass");
			String dob = request.getParameter("dob");
			
			LocalDate date = LocalDate.parse(dob);
			Period a = Period.between(date, LocalDate.now());
			int age = a.getYears();
			if(age<21) {
				pw.print("Invalid age!!");
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
		}
}
