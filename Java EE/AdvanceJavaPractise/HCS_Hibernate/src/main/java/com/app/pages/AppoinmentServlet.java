package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.core.Doctor;
import com.app.core.Patient;
import com.app.dao.AppointmentDaoImpl;
import com.app.dao.DoctorDaoImpl;

/**
 * Servlet implementation class AppoinmentServlet
 */
@WebServlet("/appointment")
public class AppoinmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection cn;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		try (PrintWriter pw = response.getWriter()) {
			pw.print("<h4>login successfully!!</h4>");

//			String firstName = request.getParameter("fn");
//			String lastName = request.getParameter("ln");

			HttpSession hs = request.getSession();
			System.out.println("in appointment servlet is new -" + hs.isNew());
			System.out.println("session id - " + hs.getId());
			Patient patient = (Patient) hs.getAttribute("patient_info");

//			PatientImpl dao1 = (PatientImpl) hs.getAttribute("patient_dao");
//			List<Patient> plist = dao1.getAllpatient();

			if (patient != null) {
				pw.print("<h3>Hello, " + patient.getFirstName() + " " + patient.getLastName() + "</h3>");
				pw.print("<h3> id = "+patient.getpatId()+"</h3>");
//				pw.print("<h3>Schedule your appoinment - <a href='addAppointment.html'>Schedule Appointment</a></h3>");

				DoctorDaoImpl dao = (DoctorDaoImpl) hs.getAttribute("doctor_dao");
				List<Doctor> dlist = dao.getAllDoctors();

				AppointmentDaoImpl apdao = (AppointmentDaoImpl) hs.getAttribute("appointment_dao");
				
				// 4. dynamic form generation
//				pw.print("<form action='apptstatus' method='post'>");
//				
//				pw.print("<h5>Select Doctor:</h5>");
//				for (Doctor c : dlist) {
//					pw.print("<h5><input type='radio' name='docter_id'  value='" +c.getDocId()+"'/>" + c.getFirstName() + " " + c.getLastName() + "</h5>");
////					int did = c.getDocId();
////					pw.print("<h5><input type = 'number' name = 'doc_id' value = ' " + c.getDocId()+"' required</h5>");
//				}  
//				pw.print("<h5>Select date <input type='date' name='dt' required>" + "</h5>");
//
//				pw.print(
//						"<h5>Select Morning time slot <input type='time' id='tm' name='tm' min='9:00' max='13:00' step='1800'/> <span class=\"validity\"></span>"
//								+ "<small>Hospital hours are 9am to 1pm</small></h5>");
////				pw.print(
////						"<h5>Select Evening time slot<input type ='radio' id='tm' name='tm' <input type='time' id='tm' name='tm' min='18:00' max='21:00' step = '1800' />/> <span class=\"validity\"></span>"
////								+ "<small>Hospital hours are 6pm to 9pm</small></h5>");
//				pw.print(
//						"<h5>Select Evening time slot <input type='time' id='tm' name='tm' min='18:00' max='21:00' step = '1800' /><span class=\"validity\"></span>"
//								+ "<small>Hospital hours are 6pm to 9pm</small></h5>");
//
//				pw.print("<h5 bg-color='black'color='white'><input type='submit' value='Book Appointment'/></h5>");
//
//				pw.print("</form>");

				
				pw.print("<form action='apptstatus' method='post'>");

				pw.print("<table style='width:100%; border:2px solid black '>");

				pw.print("<tr>");
				pw.print("<th colspan='2' style='text-align:left; padding: 10px;'>Select Doctor:</th>");
				pw.print("</tr>");
				for (Doctor c : dlist) {
				    pw.print("<tr>");
				    pw.print("<td style='padding: 10px;'><input type='radio' name='docter_id' value='" + c.getDocId() + "' required/></td>");
				    pw.print("<td style='padding: 10px;'>" + c.getFirstName() + " " + c.getLastName() + "</td>");
				    pw.print("</tr>");
				}

				pw.print("<tr>");
				pw.print("<td colspan='2' style='padding: 10px;'><h5>Select date <input type='date' name='dt' required></h5></td>");
				pw.print("</tr>");

				pw.print("<tr>");
				pw.print("<td colspan='2' style='padding: 10px;'><h5>Select Morning time slot <input type='time' id='tm' name='tm' min='09:00' max='13:00' step='1800' required /> <span class='validity'></span>");
				pw.print("<small>Hospital hours are 9am to 1pm</small></h5></td>");
				pw.print("</tr>");

				pw.print("<tr>");
				pw.print("<td colspan='2' style='padding: 10px;'><h5>Select Evening time slot <input type='time' id='tm' name='tm' min='18:00' max='21:00' step='1800' required /><span class='validity'></span>");
				pw.print("<small>Hospital hours are 6pm to 9pm</small></h5></td>");
				pw.print("</tr>");

				pw.print("<tr>");
				pw.print("<td colspan='2' style='text-align:center; padding: 10px;'><input type='submit' value='Book Appointment' style='background-color: black; color: white; padding: 10px 20px; border: none; cursor: pointer;'/></td>");
				pw.print("</tr>");

				pw.print("</table>");
				pw.print("</form>");


				
//				List<Appointment> appList = apdao.getAllAppoinmentById(patient.getpatId());
//				pw.print("Upcoming Appoinment");
//				for (Appointment a : appList) {
////					pw.print(appList);
////					pw.print(a);
//					pw.print("<h5>" + "Date: "+a.getDate() + " Time: " + a.getTime() +" Doctor Id: "+ a.getDid()+ "</h5>");
//				}
//				String firstname = request.getParameter("fn");
//				int apptid = Integer.parseInt(request.getParameter("docter_id"));
//				int apptid = request.getParameter("docter_id");
//				Date date = Date.parseDate(request.getParameter("dt"));
				/*
				 * cn = getConnection(); String dob = request.getParameter("dt");
				 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); Date startDate=
				 * (Date) sdf.parse(dob); String insert = "insert into appointment values(?)";
				 * PreparedStatement ps = cn.prepareStatement(insert); ps.setDate(1, startDate);
				 * ps.executeUpdate();
				 */
//				LocalDate date = LocalDate.parse(dob);
//				Date.valueOf(date);
//				int time = (request.getParameter("tm"));

//				
				// surround below line with try catch block as below code throws checked
				// exception
//				Date apptdate = (Date) sdf.parse(date);
//				LocalDate date2 = LocalDate.parse(date);
//				LocalDate date2 = LocalDate.parse(request.getParameter("dt"));

//				Date apptdate = Date.valueOf(LocalDate.parse(request.getParameter("dt")));	
//				Date date = request.getDateHeader("dt");

//				LocalTime time = LocalTime.parse(request.getParameter("tm"));
//				Time time = Time.valueOf(LocalTime.parse(request.getParameter("tm")));
//				int did = Integer.parseInt(request.getParameter("docter_id"));
//				int pid = Integer.parseInt(request.getParameter(patient.getpatId()));

//				Date date = Date.valueOf(LocalDate.parse(request.getParameter("dt")));
//				int pid = Integer.parseInt(patient.getFirstName());
//				int did = request.getParameter(did);

				/*
				 * String date = request.getParameter("dt"); String time =
				 * request.getParameter("tm"); int pid = patient.getpatId(); String docName=
				 * request.getParameter("docter_id"); System.out.println("docname"+docName); //
				 * System.out.println("doc id - "+doc_id); // int did =
				 * Integer.parseInt(doc_id);
				 * 
				 * Doctor doctor = dao.getDoctorByName(docName); System.out.println(doctor); int
				 * did = doctor.getDocId();
				 * 
				 * Appointment appointment = new Appointment(Date.valueOf(date),
				 * Time.valueOf(time), pid, did); Appointment addedappt =
				 * apdao.addAppointment(appointment);
				 */

				/*
				 * try { String date = request.getParameter("dt"); String time =
				 * request.getParameter("tm"); String doc_id =
				 * request.getParameter("docter_id");
				 * 
				 * if (date == null || time == null || doc_id == null || doc_id.isEmpty()) {
				 * pw.print("<h4>All fields are required!</h4>"); return; }
				 * 
				 * int did = Integer.parseInt(doc_id); pw.print("doc id"+did); int pid =
				 * patient.getpatId(); pw.print("pat id"+pid); Appointment appointment = new
				 * Appointment(Date.valueOf(date), Time.valueOf(time), pid, did); Appointment
				 * addedappt = apdao.addAppointment(appointment); pw.print("app"+appointment);
				 * pw.print("<h4>Appointment booked successfully!</h4>"); } catch
				 * (NumberFormatException e) { pw.print("<h4>Invalid doctor ID format!</h4>"); }
				 * catch (Exception e) { pw.print("<h4>Error: " + e.getMessage() + "</h4>");
				 * e.printStackTrace(); }
				 */
//				request.setAttribute("patientinfo", patient);
//				pw.flush();
//				RequestDispatcher rd = request.getRequestDispatcher("apptstatus");
//				// 3.2 include
//				rd.include(request, response);
			} else
				pw.print("<h4> No Cookies , Session Tracking Failed !!!!</h4>");
		} catch (Exception e) {
			throw new ServletException("Err in do get of - " + getClass(), e);
		}
	}
}
