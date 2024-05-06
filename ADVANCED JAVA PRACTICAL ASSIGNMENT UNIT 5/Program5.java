import java.sql.*;

public class Program5 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Connecting to database...");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/php_db?characterEncoding=utf8","root","Example@2022#");

            String insertQuery = "INSERT INTO users (username, email) VALUES (?, ?)";
            PreparedStatement pps = con.prepareStatement(insertQuery);
            pps.setString(1, "john_doe");
            pps.setString(2, "john_doe@example.com");
            int rowsInserted = pps.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted.");

            String str = "SELECT * FROM users";
            pps = con.prepareStatement(str);
            ResultSet rs = pps.executeQuery();

            while (rs.next()) {
                System.out.println("Username: " + rs.getString("username")
                        + ", Email: " + rs.getString("email"));
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
