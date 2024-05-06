import java.sql.*; 
public class dataupdate2 { 
  
    public static void main(String[] args) 
    { 
        Connection con = null; 
        PreparedStatement p = null; 
        con = Connection.ConnectDB(); 
        try { 
            String sql 
                = "update cuslogin set name='yash' where id=3"; 
            p = con.prepareStatement(sql); 
            p.execute(); 
        } 
        catch (SQLException e) { 
            System.out.println(e); 
        } 
    } 
}