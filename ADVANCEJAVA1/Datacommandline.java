import java.sql.*;

public class Datacommandline {

    public static void main(String args[]) {
        try {
            // Connect to the database
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MR_Yash?CharacterEncoding=latin1");

            // Prepare the SQL statement
            String str = "INSERT INTO student1 VALUES('id', 'name', 'age')";
            PreparedStatement sql = con.prepareStatement(str);

            // Execute the SQL statement
            sql.execute();

            System.out.println("inserted successfully");
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}