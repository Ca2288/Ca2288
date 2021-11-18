
import java.util.Scanner;


public class GenericString <S>{
private S value;

    public GenericString(S value) {
      this.value=value;  
     
    }

   
   public void printStuff(){
     System.out.println("the movies available in the box :"+value.getClass().getName()+"the title of the movie is" +value);
 }
 public void add(){
    
     Scanner scan= new Scanner(System.in);
     System.out.println("Add four movies of your choice to the list");
     String option = scan.nextLine();
     String option1 = scan.nextLine();
     String option2 = scan.nextLine();
     String option3 = scan.nextLine();
     System.out.println("your first movie option is "+option);
     System.out.println("your secound movie option is "+option1);
     System.out.println("your thired movie option is "+option2);
     System.out.println("your final movie option is "+option3);
     
 } 
} 

