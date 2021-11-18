
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;


public class FutureTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
      ExecutorService executor =Executors.newSingleThreadExecutor();
        System.out.println("factorial service for 10..");
       Future<Long>resultA= executor.submit(new FactorialService(10));
        System.out.println("factorial service for 20..");
       Future<Long>resultB= executor.submit(new FactorialService(20));
        System.out.println("returning a string thingy");
        Future<String>resultS =executor.submit(()->"------------String-------------");
       String strings =resultS.get(); 
        System.out.println(strings);
       Long ans1 =resultA.get();
        System.out.println("ans 1 is: "+ans1);
        Long ans2 =resultA.get();
        System.out.println("ans 2 is :"+ans2);
        executor.shutdown();
    }
    
}
class FactorialService implements Callable{
   private int number;
   public FactorialService(int number){
       this.number=number;
   }
    @Override
    public Long call()throws Exception{
    return factorial();
}
    private long factorial() throws InterruptedException{
      long result =1L;  
      while(number !=0){
          result *=number;
          number--;
          TimeUnit.MILLISECONDS.sleep(100);
      }
    return result;
}
}