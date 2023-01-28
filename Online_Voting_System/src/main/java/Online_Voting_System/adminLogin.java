package Online_Voting_System;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class adminLogin
 */
@WebServlet("/adminLogin")
public class adminLogin extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public adminLogin() {
        super();
        // TODO Auto-generated constructor stub
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String adminName = request.getParameter("adminName");
        String password = request.getParameter("password");
        
        DatabaseManager db = new DatabaseManager();
		java.sql.Connection  con = db.getConnection();
        
		try{
			
			PreparedStatement preparedStatement = con.prepareStatement("select * from admin where adminName = '"+adminName+"' and adminPass = '"+password+"'");
			ResultSet rs=((java.sql.Statement) preparedStatement).executeQuery("select * from admin where adminName = '"+adminName+"' and adminPass = '"+password+"'");
			   
			if(rs.next())
			   {
				   HttpSession session=request.getSession();
				   session.setAttribute("adminname", adminName);
				   response.sendRedirect("adminWelcome.jsp");
			     }
			   else  
			   {
				   out.println("WRONG CREDENTIALS");
			   }
		   }
		   catch (Exception e) {
	            System.out.println(e.getMessage());
		   }	
		}

}
