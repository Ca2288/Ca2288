
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger; 


public class DatabaseTest {

    
    public static void main(String[] args) throws SQLException {
        
            try {
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error: " + ex.getMessage());
                
                
            }
            System.out.println("Driver Loader");
            String ourUri ="jdbc:derby:c:\\javaprogs\\ourcooldb;create=true";
//            String password="secret";
//            String username="Caroline";
            Connection con =null;
           try{
                con=DriverManager.getConnection(ourUri); //,username,password
            }catch(SQLException ex){
               System.out.println("Driver loading"+ex.getMessage());
           }
            System.out.println("Got a Connection");
//        try {
//            Statement state  =con.createStatement();
//         int i=state.executeUpdate("INSERT INTO PERSON VALUES(2,'jackie',34,false)");
//            System.out.println("Done!"+i);
//        } catch (SQLException ex) {
//            System.out.println("Insert Error:"+ex.getMessage());
//        }
            
            
           try{
               PreparedStatement stat1=con.prepareStatement("*SELECT * FROM PERSON WHERE AGE>? AND IS FEMALE=?");
               stat1.setInt(1,29);
                stat1.setBoolean(2,true);
             //  Statement stat1 =con.createStatement();
               ResultSet rs=stat1.executeQuery("SELECT * FROM PERSON WHERE age>30");
               System.out.println("Done!!!");
               while(rs.next()){
                   //int id=rs.getInt("ID");
                   int id=rs.getInt(1);//same as top
                   String name = rs.getString("NAME");
                   boolean gender =rs.getBoolean("ISFEMALE");
                   int age=rs.getInt("AGE");
                   System.out.println("the person is\n "+name+"whose age is\n"+age+"and a gender\n"+gender+"");
               }
           } catch(SQLException ex){
               System.out.println("Error : "+ex.getMessage());
           }
           
            System.out.println("removing a person");
            try{
                Statement stat2=con.createStatement();
                stat2.executeUpdate("DELETE FROM PERSON WHERE ID=2");
            }catch(SQLException ex){
                System.out.println(" erro"+ex.getMessage());
            }
            
            
        try {
            if (con!=null) {
             con.close();   
            }
            
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        System.out.println("Too d'loo");
    }
    
}
