package com.app.pages;

import static comm.app.utils.DBUtils.openConnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.core.Doctor;
import com.app.core.Patient;
import com.app.dao.AppointmentDaoImpl;
import com.app.dao.DoctorDaoImpl;
import com.app.dao.PatientImpl;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private PatientImpl patientdao;
	private DoctorDaoImpl doctordao;
	private AppointmentDaoImpl appointmentdao;
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		ServletConfig config = getServletConfig();
		System.out.println("in init of " + getClass() + " cofig " + config);// not null
		try {
			// open db connection once
			// openConnection method is created in dbutils
			System.out.println("in try of init");
			openConnection(config.getInitParameter("db_url"), config.getInitParameter("user_name"),
					config.getInitParameter("password"));
			patientdao = new PatientImpl();
			doctordao = new DoctorDaoImpl();
			appointmentdao = new AppointmentDaoImpl();
			System.out.println("connection established");
		} catch (Exception e) {
			throw new ServletException("err in init - " + getClass(), e);
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			patientdao.cleanUp();
		} catch (SQLException e) {
			System.out.println("err in destroy - " + getClass());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		try (PrintWriter pw = response.getWriter()) {
			String email = request.getParameter("em");
			String password = request.getParameter("pass");
//			Patient patientinfo = (Patient) patientdao.getAllpatient();
			Patient patient = patientdao.signIn(email, password);
//			Doctor doctor = (Doctor) doctordao.getAllDoctors();
			if (patient == null) {
				pw.print("<h5>Invalid Login , Please  <a href='login.html'>Retry</a><h5>");
			} else {
				HttpSession session = request.getSession();
				System.out.println("Login servlet , session is new " + session.isNew());// t
				System.out.println("session ID " + session.getId());
				// 2. store the state of the clnt under the session scope
				session.setAttribute("patient_info", patient);
				// add daos under session scope
				session.setAttribute("patient_dao", patientdao);
//				pw.print("<h4>login successfully!!</h4>");
//				session.setAttribute("doctor_info", doctor);
				// add daos under session scope
//				session.setAttribute("patient_details", patientinfo);
				session.setAttribute("doctor_dao", doctordao);
				session.setAttribute("appointment_dao", appointmentdao);
				response.sendRedirect("appointment");
//				response.sendRedirect("viewupcomingapp");
//				pw.print("<h3>Enter choice 1.Schedule Appointment 2.View Appointment 3.Cancel Appointment </h3>");
//				pw.print("<label for=\"opt\">Choose a option:</label>");
//				pw.print("<select name=\"opt\" id=\"opt\">");
//				pw.print("<option value=\"response.sendRedirect(\"appointment\"\">Schedule Appointment</option>");
//				response.sendRedirect("appointment");
//				pw.print("<option value=\"response.sendRedirect(\"viewupcomingapp\")\">View Appoinntment</option>");
//				response.sendRedirect("viewupcomingapp");
//				pw.print("<input type=\"submit\" value=\"Submit\">");
//				<label for="cars">Choose a car:</label>
//				  <select name="cars" id="cars">
//				    <option value="volvo">Volvo</option>
//				    <option value="saab">Saab</option>
//				    <option value="opel">Opel</option>
//				    <option value="audi">Audi</option>
//				  </select>
//				  <br><br>
//				  <input type="submit" value="Submit">
//				switch(ch) {
//				
//				}
//				pw.print("<h3>Schedule Appointment</h3>");
			}
		} catch (Exception e) {
			System.out.println("Err in servicing - " + getClass());
		}
	}

}
