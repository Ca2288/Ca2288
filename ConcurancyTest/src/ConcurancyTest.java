
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class ConcurancyTest {

  
    public static void main(String[] args) {
      ConcurancyTest conTest = new ConcurancyTest();
      ThreadDemo t1=new ThreadDemo("Thread-1",conTest);
       ThreadDemo t2=new ThreadDemo("Thread-2",conTest);
         ThreadDemo t3=new ThreadDemo("Thread-3",conTest);
          ThreadDemo t4=new ThreadDemo("Thread-4",conTest);
          t1.start();
          t2.start();
          t3.start();
          t4.start();
          
//        AtomicInteger ai= new AtomicInteger(21);
//        if (ai.compareAndSet(21, 98)) {
//            System.out.println("replace 21 with 98");
//            
//        }
//        System.out.println("new value is: "+ai.incrementAndGet());
//        System.out.println("new value is: "+ai.incrementAndGet());
//        System.out.println("new value is: "+ai.incrementAndGet());
//        System.out.println("final value is: "+ai.get());
    }
    private final Lock queLock= new ReentrantLock();
    public void print(){
       queLock.lock();
       try{
           Long duration=(long)(Math.random()*10000);
           System.out.println(Thread.currentThread().getName()+"\n Time taken"+duration/1000+"Secounds");
           Thread.sleep(duration);
       }catch(InterruptedException iox){
           System.out.println("rats:" + iox.getMessage());}
       finally{
           System.out.printf(" is printed ok.",Thread.currentThread().getName());
           queLock.unlock();
       }
    }
    ///////////////////////////////////////////////////////////////
    
    
}
class ThreadDemo extends Thread{
    ConcurancyTest con;
    public ThreadDemo(String ThreadName,ConcurancyTest con){
        super(ThreadName);
        this.con=con;
    }
    
    
    @Override
    public void run(){
        System.out.printf(" \n is started to print.\n",Thread.currentThread().getName());
        con.print();
    }
    
}