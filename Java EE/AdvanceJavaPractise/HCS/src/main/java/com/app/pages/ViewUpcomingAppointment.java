package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.core.Appointment;
import com.app.core.Patient;
import com.app.dao.AppointmentDaoImpl;
import com.app.dao.DoctorDaoImpl;

/**
 * Servlet implementation class ViewUpcomingAppointment
 */
@WebServlet("/viewupcomingapp")
public class ViewUpcomingAppointment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession hs = request.getSession();
		Patient patient = (Patient) hs.getAttribute("patient_info");
		AppointmentDaoImpl apdao = (AppointmentDaoImpl) hs.getAttribute("appointment_dao");
		DoctorDaoImpl dao=(DoctorDaoImpl) hs.getAttribute("doctor_dao");
//		Appointment appt=(Appointment) apdao.getAllAppoinment();
//		List<Appointment> appList = apdao.getAllAppoinmentById(patient.getpatId());
		try (PrintWriter pw = response.getWriter()) {
			List<Appointment> appList = apdao.getAllAppoinmentById(patient.getpatId());
			pw.print("Upcoming Appoinment");
			pw.print("<table style='border:2px solid black'>");
			pw.print("<tr>");
			pw.print("<th>Appt id</th>");
			pw.print("<th>Date</th>");
			pw.print("<th>Time</th>");
			pw.print("<th>Docter Id</th>");
			pw.print("</tr>");
			for (Appointment a : appList) {
//			pw.print(appList);
//			pw.print(a);
				
				pw.print("<tr>");
				pw.print("<td>"+a.getApptid()+" "+"</td>");
				pw.print("<td>"+a.getDate()+" "+"</td>");
				pw.print("<td>"+a.getTime()+" "+"</td>");
				pw.print("<td>"+a.getDid()+" "+"</td>");
//				pw.print("<h5>" + "Appt id: "+a.getApptid()+"Date: " + a.getDate() + " Time: " + a.getTime() + " Doctor Id: " + a.getDid()
//						+ "</h5>");
				
//				System.out.println("enter appt id to delete");
//				pw.print("<h3>Enter appt id to delete</h3>");
//				if(sc.nextInt() == appt.getApptid() )
//					apdao.deleteAppt(appt.getApptid());
//				else {
//					System.out.println("Invalid appt id");
//				}
			}
			
				
		}catch(Exception e) {
			throw new ServletException("err in "+getClass(),e);
		}
	}

}
