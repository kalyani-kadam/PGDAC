package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.core.Appointment;
import com.app.core.Doctor;
import com.app.core.Patient;
import com.app.dao.AppointmentDaoImpl;
import com.app.dao.DoctorDaoImpl;

/**
 * Servlet implementation class AppointmentStatus
 */
@WebServlet("/apptstatus")
public class AppointmentStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("in appt status");
		try (PrintWriter pw = response.getWriter()) {
			pw.print("from appointment status page");

			HttpSession hs = request.getSession();
			Patient patient = (Patient) request.getAttribute("patient_dao");
//			Patient patientdetails = (Patient)request.getAttribute("patient_details");
//			Patient patientinfo = (Patient) request.getAttribute("patient_info");
			Patient patientinfo = (Patient) hs.getAttribute("patient_info");
			DoctorDaoImpl dao = (DoctorDaoImpl) hs.getAttribute("doctor_dao");
			List<Doctor> dlist = dao.getAllDoctors();
			AppointmentDaoImpl apdao = (AppointmentDaoImpl) hs.getAttribute("appointment_dao");

			String date = request.getParameter("dt");
			Date apptdate = Date.valueOf(date);
			String time = request.getParameter("tm");
			Time appttime = Time.valueOf(time + ":00");
			int did = Integer.parseInt(request.getParameter("docter_id"));
//			if(did == null)
				
//			int pid = patient.getpatId();
//			int pid = Integer.parseInt(request.getParameter(patient.getpatId()));
//			pw.print("<h5><input type='number' name='pat_id' value='"+patient.getpatId()+"'/>"+"</h5>");
//			int pid = Integer.parseInt(request.getParameter("pat_id"));
			int pid = patientinfo.getpatId();
			System.out.println("pid= " + pid);
//			pw.print("<h3> id = "+patient.getpatId()+"</h3>");
//			System.out.println("docname"+docName);
//			System.out.println("doc id - "+doc_id);
//			int did = Integer.parseInt(doc_id);
			
//			Doctor doctor = dao.getDoctorByName(docName);
//			System.out.println(doctor);
//			int did = doctor.getDocId();

			Appointment appointment = new Appointment(apptdate, appttime, pid, did);
//			Appointment addedappt = apdao.
			int status = apdao.addAppointment(appointment);

//			Patient patient = (Patient) request.getAttribute("patient_dao");
//			Appointment appointment = (Appointment) request.getAttribute("appointment_dao");

			if (status == 1) {
				pw.print("<h3>Hello, " + patientinfo.getFirstName() + " " + patientinfo.getLastName() + " "
						+ " your appointment Scheduled successfully</h3>");
			} else {
				pw.print(
						"<h3>Sorry!!\n your appointment not Scheduled, Doctor has another appoinment at this time!!</h3>");
			}
			
			  pw.flush(); 
			  RequestDispatcher rd =
			  request.getRequestDispatcher("viewupcomingapp"); // forward
			  rd.include(request, response);
			 			  
//			List<Appointment> appList = apdao.getAllAppoinmentById(patientinfo.getpatId());
//			pw.print("Upcoming Appoinment");
//			for (Appointment a : appList) {
//				pw.print(appList);
////				pw.print(a);
//				pw.print("<h5>" + a.getDate() + " " + a.getTime() +" "+ a.getDid()+ "</h5>");
//			}
//			List<Appointment> allApptList = apdao.getAllAppoinment();
//			pw.print("all appointment");
//			for (Appointment a : allApptList) {
//				pw.print(allApptList);
//			}
		} catch (Exception e) {
			throw new ServletException("err in servicing " + getClass(), e);
		}
	}
}