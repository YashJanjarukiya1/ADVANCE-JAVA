import java.sql.*;

class Databaseconn
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MR_Yash?characterEncoding=utf8","yash","Root@123");
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery("SELECT * FROM worker");

			while(res.next())
				System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3));

			con.close();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
