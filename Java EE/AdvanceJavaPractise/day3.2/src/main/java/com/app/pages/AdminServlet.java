package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.dao.CandidateDaoImpl;
import com.app.entities.Candidate;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CandidateDaoImpl candidatedao;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		try(PrintWriter pw= response.getWriter()){
			System.out.println("in admin doget try");
			HttpSession hs=request.getSession();
			System.out.println("is session a new "+ hs.isNew());
			CandidateDaoImpl candidate = (CandidateDaoImpl)hs.getAttribute("candidate_dao");
//			pw.print("<h4>in admin doget</h4>");
//			List<Candidate> candidateList = new ArrayList<>();
//			candidateList=candidate.getTop2Candidates();
			List<Candidate> candidateList = candidate.getTop2Candidates();
//			pw.print(candidateList);
			candidateList.forEach(i->pw.print("<h3>Top 2 candidates</h4>" + i));
//			Candidate candidate = new Candidate();
//			candidateList.forEach((Consumer<? super Candidate>) candidate);
			
//			Map<String,Integer> candidateMap = new LinkedHashMap();
//			candidateMap=candidate.getPartyWiseVotes();
			Map<String,Integer> candidateMap = candidate.getPartyWiseVotes();
//			candidateMap.forEach((k,v) -> pw.print("<h3>Candidate by party wise</h3>" +v))
			candidateMap.forEach((k,v)->pw.print("<h3>Candidate by party wise</h3>"+"<h3>Candidate name</h3>"+k+"<h3>Votes</h3>" +v));
//			public static void displayDetails(Map<String,Customer> customers) {
//				System.out.println("All customer details");
//				for (Customer c : customers.values()) {
//					System.out.println(c);
//				}
//			}
//			candidateMap.forEach((String name,Integer id))->pw.print(name +" "+);
//			for(Candidate c:candidateList) {
//				pw.print(c.toString());
//			}
//			pw.print(candidateMap);
		} catch (Exception e) {
			throw new ServletException("error in do get"+getClass(),e);
//			e.printStackTrace();
		}
			
//		try {
//			candidatedao.getPartyWiseVotes();
//		} catch (SQLException e) {
//			System.out.println(e);
//		}
	}

}
