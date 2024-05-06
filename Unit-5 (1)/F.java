import java.sql.*;

class F {
    public static void main(String args[]) {
        String name = args[0];
        // int id = Integer.parseInt(args[0]);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://root@localhost:3306/jaavaa?characterEncoding=utf8",
                    "root", "9998562683");
            // String str = "DELETE FROM pro WHERE id = ?";
            String str = "DELETE FROM pro WHERE name = ?";
            PreparedStatement sql = con.prepareStatement(str);
            // sql.setInt(1,id);
            sql.setString(1, name);
            sql.executeUpdate();
            System.out.println("Data Deleted");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}