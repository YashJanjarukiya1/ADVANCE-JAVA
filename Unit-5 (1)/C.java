import java.sql.*;

class C {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://root@localhost:3306/jaavaa?characterEncoding=utf8",
                    "root", "9998562683");
            String str = "INSERT INTO student(rollno,name,semester) VALUES(1,'Meet','FY')";
            // String str1 = "INSERT INTO student(rollno,name,semester)
            // VALUES(2,'Tushar','SY')";
            PreparedStatement sql = con.prepareStatement(str);
            // con.preparestatement(str1);
            sql.executeUpdate();
            System.out.println("inserted");
            Statement stmnt = con.createStatement();
            ResultSet rs = stmnt.executeQuery("select * from student");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            con.close();
            sql.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}