package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MYSQLConnection {

	public static void main(String[] args) {
		try {	
			Class.forName("com.mysql.cj.jdbc.Driver");	//Register your Driver
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/testdb","root","1234567"); 	//Create Connection
			Statement st=con.createStatement();	//Create Statement
			
			ResultSet rs=st.executeQuery("select * from Persons"); 	//Execute the Query
			 
			while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
			con.close();	//Close Connection
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
