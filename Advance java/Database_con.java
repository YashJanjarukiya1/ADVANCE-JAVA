import java.sql.*;
import java.sql.DriverManager;
import java.sql.connection;

class Database_con
{
	public static void main(String args[])
	{
	   try
	   {
	      System.out.println("hello");
	      connection con=null;
	      class.forName("com.mysql.jdbc.Driver");
	      connection con=DriverManager.getconnection("jdbc:mysql://localhost:3306/emp?CharacterEncoding=utf8","root","Root@123");

	      System.out.println("database is connected");
	      con.close();
	   }
	   catch (Exception e)
	   {
	   	System.out.println("do not connected to database error");
	   }
	}
}