import java.sql.*;

class B {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://root@localhost:3306/jaavaa?characterEncoding=utf8",
                    "root", "9998562683");
            Statement stmnt = con.createStatement();
            ResultSet rs = stmnt.executeQuery("select * from pro");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}