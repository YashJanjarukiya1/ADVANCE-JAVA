import java.sql.*;

class A {
    public static void main(String args[]) {
        try {
            System.out.println("Hello");
            Connection conn = null;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://root@localhost:3306/jaavaa?characterEncoding=utf8",
                    "root", "9998562683");
            System.out.println("Database is Conected!");
            con.close();
        } catch (Exception e) {
            System.out.println("Do not connect to DB -Error : " + e);
        }
    }
}