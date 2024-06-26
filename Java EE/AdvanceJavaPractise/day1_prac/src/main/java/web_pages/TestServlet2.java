package web_pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */


//runtime ,class level,mandatory annotation meant for WC i.e. For JVM
//WHEN u deploy web app, WC creates a Map
//key -- url pattern(/hello)
//value -- FQ SERVLET class name(web_pages.TestServlet)

//URL -- http://localhost:8080:day1_prac/hello
//URL -- http://host:port/day1_prac/hello

//http - app layes protocol(scheme)
//host -DNS qualified host name(www.abc.com) Or IP address
//port - TCP port no (default port - 8080)

//URI - /day1_prac/hello
// /day1_prac - context(=web app) root
///hello -- URL pattern

public class TestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		System.out.println("in init"+getClass());
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("in init from "+getClass());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doGet"+getClass());
		//1. set response content type
		response.setContentType("text/html");
		//2. Get PW  from HttpServletResponse,
//		to send buffered text contents -->to the client 
		
		try(PrintWriter pw = response.getWriter()){
			//add dyn contents to PW's buffer
			pw.print("<h4> Hello from Servlets again..."+LocalDateTime.now()+"</h4>");
//			pw.print("<h4>Welcome 2 Servlets !!! , Server Time Stamp " 
//					+ LocalDateTime.now() + "</h4>");
		}
	}

}
