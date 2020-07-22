package pactice;

import java.sql.*;

public class MyConnection {

	
	public static Connection connectTo(){
		
		// loading clas driver 
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_shopping","root","DreamGoogle*7045");
		
		if(con!=null) {
			System.out.println("Connection Eshtablish");
		}
		else {
			System.out.println("Connection Not Eshtablish");
		}
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
		
	}
	
	public static void main(String[] args) {
		MyConnection.connectTo();
	}
}
