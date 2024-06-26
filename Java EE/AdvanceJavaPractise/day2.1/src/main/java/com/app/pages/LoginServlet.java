package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.UserDaoImpl;
import com.app.entities.User;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet(value = "/login")
@WebServlet(value = "/login", loadOnStartup = 1) // eager init -->if u have time consuming logic then use eager
													// initialization
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDaoImpl userDao;

//	overriding form of the method can not throw any NEW or BROADER checked exc
	@Override
	public void init() throws ServletException {
		System.out.println("in init of " + getClass());

//		UserDaoImpl has thrown sqlexc & it is checked exc

		try {
			// create user dao instance
//			dependent : servlet, dependency : use dao(for data access logic)
//			dependent object is creteating its own dependency

			userDao = new UserDaoImpl();
		} catch (Exception e) {
			// centralized exc handling in Servlet
			/*
			 * In case of err in init --To inform the WC throw ServletException --WC will
			 * abort the life cycle Ctor of javax.servlet.ServletException(String mesg,
			 * Throwable rootCause)
			 */
			throw new ServletException("err in init - " + getClass(), e);
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			// WC invokes it once @ end of the life cycle
			// clean up Dao
			userDao.cleanUp();
		} catch (Exception e) {
			System.out.println("err in destroy - " + getClass());
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. set resp cont type
		response.setContentType("text/html");

		// 2. Get PW to send text resp
		try (PrintWriter pw = response.getWriter()) {

			// 3. Get req params(email n pwd) from the req
			String email = request.getParameter("em");// em should match with form in login.html
			String password = request.getParameter("pass");// pass should match with form in login.html
			
//			pw.print("<h4><a href='regisration.html'>Register</a></h4>");
			
			// 4. Invoke user dao's --sign in method for user authentication
			User user = userDao.signIn(email, password);
			// 5 . check if valid (via null)
			if (user == null) {
				// invalid login --send retry link --login.html
//				pw.print("<h4>Create Account <a href='regisration.html'>Register</a></h4>");
				pw.print("<h5>Create Account , Please  <a href='registration.html'>Register</a><h5>");
				pw.print("<h5>Invalid Login , Please  <a href='login.html'>Retry</a><h5>");
			} else {
				// valid login --1. Create a Cookie to store validated details
				// javax.servlet.http.Cookie(String cookieName,String cookieValue)
				Cookie c1 = new Cookie("user_details", user.toString());

				// 2. send the cookie to client using response header
				// HttpservletResponse's method
				// publid void addCookie(Cookie c)
				response.addCookie(c1);
//				continue to role based authorization
//				pw.print("<h5>Successful Login </h5>");
//				pw.print("<h5> User Details "+user+"</h5>");
				if (user.getRole().equals("voter")) {
					// => voter login --> check the voting status
					if (user.isStatus()) // => already voted --> redirect to logout page
						response.sendRedirect("logout");
					else // voter : not yet voted --> redirect to candidate list page
						response.sendRedirect("candidate_list");
					
					/*
					 * Wc -1. clears /empties the PW's buffer 
					 * 2. send temp redirect resp - SC 302,
					 * Header - 1. loctaion = "candidate_list" 2. set-Cookie - cookiename - value
					 * resp body - empty 
					 * 3. client browser checks privacy settings cookies blocked
					 * -- wont be stored -- can not remember the client --session tracking failed
					 * cookies accepted -- cookie age -- def value -1 => saves it in browser
					 * cache(cookie storage) 
					 * 4. client browser - sends the NEXT req (redirect) URL -
					 * http://host:port/day2.1/candidate_list (this is for servlet as their is no
					 * extension(.html) method - GET --> CandidateListServlet + add the cookie in
					 * request header
					 */

				} else {
					// admin login -- redirect the clnt to admin page in NEXT request coming from
					// the clnt
					response.sendRedirect("admin");
				}

			}

		} // JVM : pw.close --> flush --> render/commits the resp
		catch (Exception e) {
			// inform the WC about the exc
			throw new ServletException("err in servicing " + getClass(), e);
		}

	}

}
