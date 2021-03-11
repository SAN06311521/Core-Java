import java.sql.*;
import java.io.*;

public class insert
{
public static void main(String ag[]) throws Exception
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con = DriverManager.getConnection("jdbc:odbc:Temp");
String sql ="INSERT INTO COFEE1 VALUES ('Nescofee',200,39,51,6)";
Statement st = con.createStatement();
int count = st.executeUpdate(sql); 

System.out.println(count+ " row inserted");
st.close();
con.close();
}


}