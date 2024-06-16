package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/test1")
/*
 * Run time , class level MANDATORY annotation
 * WC creates EMPTY Map @ app dep time
 * Upon servlet deployment , WC adds key : URL pattern (eg : /test1)
 * value --F.Q servlet class name 
 * 
 */
public class FirstServlet extends HttpServlet {
	// override - init , doGet , destroy --to understand servlet life cycle

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("in doGet - " + Thread.currentThread());
		// 1. set resp content type
		resp.setContentType("text/html");
		// 2. get PW
		try (PrintWriter pw = resp.getWriter()) {
			pw.print("<h5> hello from servlet ...." + new Date() + "</h5>");
		} // JVM (WC) -- pw.close --> pw.flush : committing the resp to the clnt
	}

	@Override
	public void destroy() {
		System.out.println("in destroy - " + Thread.currentThread());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("in init - " + Thread.currentThread());
	}

}
