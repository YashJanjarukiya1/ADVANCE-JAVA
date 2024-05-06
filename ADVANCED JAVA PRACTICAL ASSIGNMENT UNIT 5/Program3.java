import java.sql.*;

class Program1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/php_db?characterEncoding=utf8","root","Example@2022#");

			String str = "DELETE FROM student WHERE rollno = 1";
			PreparedStatement pps = con.prepareStatement(str);
			pps.executeUpdate();

			System.out.println("DATA DELETED");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}