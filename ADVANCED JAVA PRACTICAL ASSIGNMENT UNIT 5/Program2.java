import java.sql.*;

class Program1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/php_db?characterEncoding=utf8","root","Example@2022#");

			Statement st = con.createStatement();
			ResultSet rs = st.executQuery("select * from student");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
			}

			con.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}