package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.core.Student;

/**
 * Servlet implementation class AdmissionResultServlet
 */
@WebServlet("/result")
public class AdmissionResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter pw = response.getWriter()) {
			pw.print("<h4> from the result page ...</h4>");
			// get student details(student object) from --req scoped attribute
			Student student = (Student) request.getAttribute("student_details");
			if (student != null) {
				pw.print("<h4>Hello " + student.getFirstName() + " " + student.getLastName());
				if(student.isAdmissionStatus())
					pw.print("<h4> Congratulations ! You are admitted in the Course "+student.getSelectedCourse()+"</h4>");
				else
					pw.print("<h4>Sorry ! You are not admitted in the Course "+student.getSelectedCourse()+"</h4>");
			} else
				pw.print("RD failed !!!!!!!!!!!!!!!");
		}
	}

}
