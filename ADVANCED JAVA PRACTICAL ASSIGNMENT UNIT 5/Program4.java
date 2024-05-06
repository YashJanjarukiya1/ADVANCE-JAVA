import java.sql.*;

class Program1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/php_db?characterEncoding=utf8","root","Example@2022#");

			String str = "UPDATE student SET semester = 5 WHERE semester = 4";
			Statement st = con.createStatement();
			st.executeUpdate(str);

			System.out.println("DATA UPDATED");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}