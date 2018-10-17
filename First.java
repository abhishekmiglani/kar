package com.abhi;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class First
 */

public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public First() {
//        super();
//        // TODO Auto-generated constructor stub
//    }erv
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s = request.getParameter("fullname");
		String number  = request.getParameter("number");
		String email = request.getParameter("email");
		String year = request.getParameter("year");
		String address = request.getParameter("address");
		String pincode = request.getParameter("pin_code");
		String career_objective = request.getParameter("objective");
		String year10 = request.getParameter("year");
		String degree = request.getParameter("degree");
		PrintWriter out = response.getWriter();
		out.println("<html><head>");
		out.println("<link rel=\"stylesheet\" href=\"action.css\">");
		out.println("<body>");
		out.println("<h1> <center>RESUME </center></h1>");
		out.println("<h2>"+s+"</h2>");
		out.println("<hr>");
		out.println(address+" - "+ pincode+"<br>");
		out.println("Contact : "+number+"<br>\r\n" + 
				"	Email ID : \r\n" + 
				"	<h3>CAREER OBJECTIVE</h3>\r\n" + 
				"	<p>"+career_objective+"</p>");
		out.println("<h3>EDUCATIONAL QUALIFICATIONS</h3>\r\n" + 
				"	<table>\r\n" + 
				"		<tr>\r\n" + 
				"			<th>YEAR</th>\r\n" + 
				"			<th>DEGREE</th>\r\n" + 
				"			<th>SCHOOL/INSTITUTE</th>\r\n" + 
				"			<th>BOARD/UNIVERSITY</th>\r\n" + 
				"			<th>PERCENTAGE/CGPA</th>\r\n" + 
				"		</tr>"	+
				"<tr>"
				+ "<td>"+year10+"</td>"
				+ "<td>"+degree+"</td>"
				+ "<td>"+ +"</td>"
				+ "<td></td>"
				+ "<td></td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td></td>"
				+ "<td></td>"
				+ "<td></td>"
				+ "<td></td>"
				+ "<td></td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td></td>"
				+ "<td></td>"
				+ "<td></td>"
				+ "<td></td>"
				+ "<td></td>"
				+ "</tr>"
				+ "	</table>"
				);
		out.println("<h3>AREAS OF EXPERTISE</h3>\r\n" + 
				"	<div></div>\r\n" + 
				"	<h3>ACADEMIC PROJECTS</h3>\r\n" + 
				"	<table>\r\n" + 
				"		<tr>\r\n" + 
				"			<th>PROJECT NAME </th>\r\n" + 
				"			<th id = \"desc\">DESCRIPTION </th>\r\n" + 
				"		</tr>\r\n" + 
				"		<tr>\r\n" + 
				"			<td> <?php echo $_GET[\"project_name\"];?></td>\r\n" + 
				"			<td> <?php echo $_GET[\"project_description\"];?>\r\n" + 
				"	</table>	\r\n" + 
				"			");
		out.println("</body>");
		out.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
