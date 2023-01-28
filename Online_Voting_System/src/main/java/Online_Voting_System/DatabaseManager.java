package Online_Voting_System;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Servlet implementation class DatabaseManger
 */
@WebServlet("/DatabaseManger")
public class DatabaseManager extends HttpServlet {
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinevotingdb","root","Nami9903@");
			return conn;
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
				return null;
			}catch(SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
	}
	


