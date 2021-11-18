
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Lloops {

    
  
    public static void main(String[] args) {
        
     Scanner scan = new Scanner(System.in);
     
        System.out.println("Input six of your favourite numbers to calculate the avarage");
        ArrayList<Integer>  mark = new ArrayList();
       
  int mark1=scan.nextInt();
         for (Iterator<Integer> it = mark .iterator(); it.hasNext();) {
            int i = it.next();
            if (mark.size()<6) {
                System.out.println("more numbers plz");
            }
        }
         
               
//         int mark2 = scan.nextInt();
//         int mark3 = scan.nextInt();
//         int mark4 = scan.nextInt();
//         int mark5 = scan.nextInt();
//         int mark6 = scan.nextInt();
//            
//         mark.add(mark1);
//         mark.add(mark2);
//         mark.add(mark3);
//         mark.add(mark4);
//         mark.add(mark5);
//         mark.add(mark6);
//         for (int i = 0; i < mark.size(); i++) {
           
//            
//        }
       
         
        
        }       
      }







//       int  result=(mark1+mark2+mark3+mark4+mark5+mark6)/6;{
            
        
          
        // System.out.println("your Average is "+result);
     
     

    
    


