
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class ReadWriteLockTest {
   private final static ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);
   private static String message = "a";
   
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new WriterA());
        t1.setName("writer A");
        Thread t2 = new Thread(new WriterB());
        t2.setName("writer b");
        Thread t3 = new Thread(new Reader());
        t3.setName("reader");
        t1.start();
         t2.start();
          t3.start();
           t1.join();
           t2.join();
           t3.join();
    }
 
   
  static class Reader implements Runnable{

        @Override
        public void run() {
            if (lock.isWriteLocked()) {
                System.out.println("Write Lock is present."); 
            }
            lock.readLock().lock();
            try{
           Long duration=(long)(Math.random()*10000);
           System.out.println(Thread.currentThread().getName()+"\n Time taken"+duration/1000+"Secounds");
           Thread.sleep(duration);
       }catch(InterruptedException iox){
           System.out.println("rats:" + iox.getMessage());}
       finally{
           System.out.printf(" is printed ok.",Thread.currentThread().getName());
           lock.readLock().unlock();
       }
        }
       
   }
  static class WriterA implements Runnable{
     @Override
     public void run()  {
         lock.writeLock().lock();
          try{
           Long duration=(long)(Math.random()*10000);
           System.out.println(Thread.currentThread().getName()+"\n Time taken"+duration/1000+"Secounds");
           Thread.sleep(duration);
       }catch(InterruptedException iox){
           System.out.println("rats:" + iox.getMessage());}
       finally{
           
              message=message.concat("a");
           lock.writeLock().unlock();
     }
   }
   }
  static class WriterB implements Runnable{
     @Override
     public void run()  {
         lock.writeLock().lock();
          try{
           Long duration=(long)(Math.random()*10000);
           System.out.println(Thread.currentThread().getName()+"\n Time taken"+duration/1000+"Secounds");
           Thread.sleep(duration);
       }catch(InterruptedException iox){
           System.out.println("rats:" + iox.getMessage());}
       finally{
           
              message=message.concat("a");
            lock.writeLock().unlock();
     }
   }
   }
}

