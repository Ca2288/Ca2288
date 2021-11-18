
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


public class Person {
    public static void main(String[] args) throws SQLException {
  Person p =new Person();
  p.Personp();
        System.out.println(""); 
        
    }

   
String name;
int age;
String gender;

    public void Personp() throws SQLException {
        this.name = name;
        this.age = age;
        this.gender = gender;
//        while(name!=null){
//            System.out.println("name missing!!!!!! ");   
//        }
        Scanner Scan = new Scanner(System.in);
         try {
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error: " + ex.getMessage());
                
                
            }
            System.out.println("Driver Loader");
            String ourUri ="jdbc:derby:c:\\javaprogs\\ourcooldb;create=true";
//           
            Connection con =null;
           try{
                con=DriverManager.getConnection(ourUri); //,username,password
            }catch(SQLException ex){
               System.out.println("Driver loading"+ex.getMessage());
           }
            System.out.println("Got a Connection");
            
            
            
            
        System.out.println("welcome to your database");
        System.out.println("Please insert the names of the person");
        name=Scan.nextLine();
        
        System.out.println("what is the age of the person ");
        age=Scan.nextInt();
         gender=Scan.nextLine();
        System.out.println(" what is the gender of the person");
         gender=Scan.nextLine();
        System.out.println(gender);
        ArrayList u= new ArrayList<>() ;
       u.add(name);
        u.add(age);
        u.add(gender);
        System.out.println("The name of the person is\n"+name+" The age of the person is\n"+age+" The gender of the person is\n"+gender);
String cs ="y",n;
cs=Scan.nextLine();
        System.out.println("would you like to carry on? press (y or n) y for yes n for no ");
        cs=Scan.nextLine();
        
    }
}
  
    
    


