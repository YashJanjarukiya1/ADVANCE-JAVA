import java.sql.*;

class E {
    public static void main(String args[]) {
        int id = Integer.parseInt(args[0]);
        String name = args[1];
        int age = Integer.parseInt(args[2]);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://root@localhost:3306/jaavaa?characterEncoding=utf8",
                    "root", "9998562683");
            String str = "INSERT INTO emp1(id,name,age) VALUES(?,?,?)";
            PreparedStatement sql = con.prepareStatement(str);
            sql.setInt(1, id);
            sql.setString(2, name);
            sql.setInt(3, age);
            sql.executeUpdate();
            System.out.println("Data Inserted");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}