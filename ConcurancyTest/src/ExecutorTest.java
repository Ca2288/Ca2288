
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class ExecutorTest {
    public static void main(String[] args) {
     ExecutorService es=Executors.newSingleThreadExecutor();
        
        try{
            es.submit(new Task());
            System.out.println("Shutting down");
            es.shutdown();
            es.awaitTermination(5, TimeUnit.SECONDS);
            
        }catch(InterruptedException ex){
            System.out.println("error"+ex.getMessage());
        }finally{
            if (es.isTerminated()) {
                System.out.println("Forcing a shutdown!");
             es.shutdownNow();
            }
        }
        
        
        
//     Executor executor = Executors.newCachedThreadPool();
//   executor.execute(new  Task());   
//   executor.execute(new  Task());
//   executor.execute(new  Task());
//   
//   ThreadPoolExecutor ourPool = (ThreadPoolExecutor)executor;
//   ourPool.shutdown();
    }
   
}
class Task implements Runnable{
    @Override
    public void run(){
       try{
            Long duration=(long)(Math.random()*10);
           System.out.println("Sytem is running!!!!!!");
           TimeUnit.SECONDS.sleep(duration);
       }catch(InterruptedException ex){
           System.out.println("error:" + ex.getMessage());}
       
       } 
    }




