package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.core.Course;
import com.app.core.Student;

/**
 * Servlet implementation class ProcessFormServlet
 */
@WebServlet("/process_admission")
public class ProcessFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter pw = response.getWriter()) {
			// 1. get student details from the req params
			String firstName = request.getParameter("fn");
			String lastName = request.getParameter("ln");
			int score = Integer.parseInt(request.getParameter("score"));
			Course course = Course.valueOf(request.getParameter("course").toUpperCase());
			Student student = new Student(firstName, lastName, course, score);
			// 2. validate
			if (score >= course.getMinScore()) {
				student.setAdmissionStatus(true);
			}
			// save student details under request scope
			request.setAttribute("student_details", student);
			pw.print("<h5> Saving student details from 1st page ....</h5>");
			pw.flush();
			// 3. server pull - forward
			// 3.1 get RD
			RequestDispatcher rd = request.getRequestDispatcher("result");
			// 3.2 include
			rd.include(request, response);//IllegalStateExc -- can't forward after committing the resp
			/*
			 * WC -- 1. retains the resp buffer
			 * 2. suspends exec of this page n calls 
			 * -next page's doPost --after it rets , 
			 * control comes back to the 1st page And  it CAN  
			 * generate the dyn resp.
			 * 
			 */
			System.out.println("control came back.....");
			pw.print("<h5>after include</h5>");
		}
	}

}
