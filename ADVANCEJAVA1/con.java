import java.sql.*;

class Con
{
	public static void main(String args[])
	{
		try 
		{
			System.out.println("hello");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MR_Yash?CharacterEncoding=utf8","yash","Root@123");
			Statement stmt=con.createStatement();
			ResultSet res=stmt.executeQuery("select * from yash1");

			while(res.next())
				System.out.println(res.getInt(1)+" "+res.getString(2)+ " "+ res.getInt(3));

			con.close();
        }  

			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}