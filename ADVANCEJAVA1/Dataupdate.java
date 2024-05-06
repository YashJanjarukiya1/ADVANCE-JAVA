import java.sql.*;

class Dataupdate
{
	public static void main(String args[])
	{
		try 
		{
			System.out.println("hello");

			Class.forName("com.sql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MR_Yash?CharacterEncoding=utf8","yash","Root@123");
			String str="UPDATE STUDENT2 SET NAME=? WHERE ID=?";

			PreparedStatement sql = con.prepareStatement(str);

			sql.setInt(1,10);
			sql.setString(2,"priya");
			sql.executeUpdate();

			System.out.println("data update");

			con.close();

		}

		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}