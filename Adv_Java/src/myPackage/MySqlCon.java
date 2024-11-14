package myPackage;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.concurrent.Callable;



public class MySqlCon {

	public static void main(String[] args) {

		try {	
			Class.forName("com.mysql.cj.jdbc.Driver");	//Register your Driver
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/testdb","root","1234567"); 	//Create Connection
			Statement st=con.createStatement();	//Create Statement
			 
		/*	// rs=st.executeQuery("select * from Persons"); 
			// st.executeUpdate("insert into Persons values(4,'Aman','pune','Satara')");
			// int result=st.executeUpdate("delete from Persons ehere personId=4");
			// System.out.println("Record Inserted Successfully");
			 
			ResultSet rs=st.executeQuery("select * from Persons"); 	//Execute the Query
		 
			while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}*/
			
		/*	//Using PreparedStatement
			PreparedStatement ps=con.prepareStatement("select * from Persons");
			ResultSet rs=ps.executeQuery();
			
			ResultSetMetaData rmd=rs.getMetaData();
			System.out.println("Total number of column "+rmd.getColumnCount());
			System.out.println("Column Name of 1st column "+rmd.getColumnName(2));
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			} */
			
			
		/*	//Using CallableStatement
			java.sql.CallableStatement stmt=con.prepareCall("insert into Persons values(?,?,?,?)");
			stmt.setInt(1, 101);
			stmt.setString(2, "Amit");
			stmt.setString(3, "GandhiNagar");
			stmt.setString(4, "Mumbai");
			stmt.execute();
			System.out.println("Record Inserted"); 
			*/
			
			con.close();	//Close Connection
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
