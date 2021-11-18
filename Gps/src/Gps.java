import java.util.ArrayList;
import java.util.Scanner;

class myGps{
    public void Go(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the X corodinates: ");
        Double X = (double)scan.nextInt();     
        System.out.print("Please enter the Y coordinates: ");
        Double Y = (double)scan.nextInt();
        
       ArrayList <Double> lst = new ArrayList<>();
       lst.add(X);
       lst.add(Y);
       for(Double distance = 0.0; distance<lst.size() -1;){
           if (Y<X) {
            distance = X-Y;
           System.out.println("Distance = " + distance + " km/h");    
        Double speed;
            Double t = 0.1;      
            speed = distance*t;
            t = speed*3600;
            System.out.println("Speed = " +speed + " km/h");
            System.out.println("Time = " + t + " seconds");  
          }else{System.out.println("Oops ");break;}
       }
    }
}
public class Gps {
   
    public static void main(String[] args) {
        new myGps().Go();        
    }  
}
