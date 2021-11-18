
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student24
 */
public class ExceptionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ExceptionTest().run();
    }
  private void run()  {
     int val1=3;
     int val2=0;
     try{
         if(val2==0){
             IOException ex =new IOException("whaat");
             throw(ex);
         }
         int ans =val1/val2;
         
         System.out.println("Ans: "+ans);   
     
     }catch(ArithmeticException |IOException ex ){
         System.out.println("oh rates"+ex.getMessage());
    
     }finally{
         System.out.println("i am finally");
     }
      System.out.println("carry on here!!!");
  }
}
