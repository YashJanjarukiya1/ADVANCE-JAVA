import java.sql.*;

class datacommandline
{
	public static void main(String args[])
	{
		int id=Integer.parseInt(args[0]);
		String name=args[1];
		int age=Integer.parseInt(args[2]);

		try 
		{
			System.out.println("hello");

			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306:/MR_Yash?CharacterEncoding=utf8","yash","Root@123");

			String str="INSERT INTO PROFE VALUES('id','name','age')";
			prepareStatement sql=con.prepareStatement(str);

			sql.execute();

			System.out.println("inserted successfully");
			con.close();
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}