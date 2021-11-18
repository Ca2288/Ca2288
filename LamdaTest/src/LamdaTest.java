
import java.util.Scanner;
import java.util.function.Predicate;


public class LamdaTest {

    
    public static void main(String[] args) {
       
     new LamdaTest().run();
        
    }
    private void run(){
        
     
     boolean ans =foo(s -> s.contains("hi"),"ho there!!");
        System.out.println("Does it contain Hi? "+ans);
        Scanner scan= new Scanner(System.in);
        String st=scan.nextLine();
        ans=foo(s->s.startsWith("+123"),st);
        System.out.println("is the string entered correct" +ans);
    }
    private boolean foo(Predicate<String> pred,String str){
        return pred.test(str);
    }
}
@FunctionalInterface
interface _Predicate{
    boolean test(String str);
            
}