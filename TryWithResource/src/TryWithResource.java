
import java.io.IOException;


public class TryWithResource {

  
    public static void main(String[] args) {
      try(MyClass mc = new MyClass();
          MyClass1 mc1 = new MyClass1();)
          
      {
          System.out.println("inside the try block");
     throw new RuntimeException();
      } catch(Exception ex){
          System.out.println("inside my main method");
          for(Throwable th: ex.getSuppressed())
          System.out.println("Ex: "+th);   
      }finally{
          System.out.println("inside mains finally");
      }
    }  
}
class MyClass implements AutoCloseable{
private int val =5;
    @Override
    public void close() throws Exception {
        System.out.println("hello from close:");
        throw new IOException("oopsie!!");
    }
   public int getVal() {
     return val;  
   }
}
class MyClass1 implements AutoCloseable{
private int val =1985;
    @Override
    public void close() throws Exception {
        System.out.println("hello from close in myClass1:");
    }
       public int getVal() {
     return val;  
   }
 } 
class MyClass2 implements AutoCloseable{
private int val =1985;

    @Override
    public void close() throws Exception {
        System.out.println("hello from close in myClass1:");
        
    }
    public int getVal() {
     return val;  
   }
} 