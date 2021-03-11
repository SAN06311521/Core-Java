import java.sql.*;
import java.io.*;

public class Ex {
	public static void main(String ag[]) {
		Connection con;
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:TEMP1"); //Here TEMP is Data Source Name (DSN)
			Statement st = con.createStatement();
			st.executeUpdate ("CREATE TABLE COFEE" + "(COF_Name VARCHAR(32),SUB_ID INTEGER,PRICE FLOAT,SALES INTEGER,TOTAL INTEGER)");
		} 
		catch(ClassNotFoundException e) {
			System.out.println(e.toString());
		}
		catch(SQLException e) {
			System.out.println(e.toString());
		}
	}

}


//this program is of JDBC
// first, create a access file
//open control panel
//search for odbc
//dBMS file select
//add filename and desc
