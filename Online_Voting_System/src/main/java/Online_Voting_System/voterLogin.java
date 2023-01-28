package Online_Voting_System;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class voterLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 public voterLogin() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        
	        String voternum = request.getParameter("voterNumber");
	        // we have to check if user existing or not and if he voted or not as well
	        
	        DatabaseManager db = new DatabaseManager();
			java.sql.Connection  con = db.getConnection();
	        
	        
	        try {
	        	
			   PreparedStatement preparedStatement1 = con.prepareStatement("select voter_card_number from vote where voter_card_number = '"+voternum+"'");
	           ResultSet rs1= preparedStatement1.executeQuery("select voter_card_number from vote where voter_card_number = '"+voternum+"'");
	           
	           if(rs1.next())
	           {
	        	   
	           response.sendRedirect("votercheck.jsp");
	           out.println("You already voted........"+rs1.getString("voter_card_number"));
	           }else
	           {
	        	PreparedStatement preparedStatement2 = con.prepareStatement("select vid,pnumber from voters where voter_card_number = '"+voternum+"'");
	            ResultSet rs =   preparedStatement2.executeQuery("select vid,pnumber from voters where voter_card_number = '"+voternum+"'");
	            if(rs.next()){
	                String contact = rs.getString("pnumber");
	                response.sendRedirect("userWelcome.jsp?con="+contact);
	                out.println(contact);
	            }else{
	                out.println("Please enter valid card number");
	            }
	           }
	        } catch (SQLException ex) {
	           
	        }
	        out.println(voternum);
		
	}

}
