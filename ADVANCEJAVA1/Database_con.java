import java.sql.*;

class Database_con
{
	public static void main(String args[])
	{
	   try
	   {
	      System.out.println("hello");
	     
	      Class.forName("com.mysql.jdbc.Driver");
	      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MR_Yash?characterEncoding=utf8","yash","Root@123");

	      Statement stmt = con.createStatement();
	      
	      ResultSet res = stmt.executeQuery("SELECT * FROM employee");
	      
	      while(res.next())
	      
	      		System.out.println("id : " + res.getInt(1));
	      
	      con.close();
	   }
	   catch (Exception e)
	   {
	   	System.out.println("do not connected to database error"+e);
	   }
	}
}
