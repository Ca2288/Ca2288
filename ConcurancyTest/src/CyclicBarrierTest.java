
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CyclicBarrierTest{
    
    private CyclicBarrier cb;
    private final ArrayList<String> list = new ArrayList<>();
    private final String[] dog1 = {"Rammy","snoopy","snowy","spoti"};
    private final String[] dog2 = {"Rex","Tiger","lion","Chappy"};
    
    public static void main(String[] args) {
        new CyclicBarrierTest().foo();
    }
    
    private void foo(){
      cb=new CyclicBarrier(2,() -> {
          list.addAll(Arrays.asList(dog1));
          list.addAll(Arrays.asList(dog2));
          System.out.println(Thread.currentThread().getName() + " Result: " + list);
      });
      Thread t1 = new Thread(new ProccessDogs(dog1));
      Thread t2 = new Thread(new ProccessDogs(dog1));
      t1.start();
      t2.start();
    }

class ProccessDogs implements Runnable{
    String[]dogs;
    public ProccessDogs(String[]dogs){
        this.dogs=dogs;
    }

    @Override
    public void run() {
        for(int i=0;i<dogs.length;i++){
            String str =dogs[i];
            dogs[i]=str.substring(0,1).toUpperCase()+str.substring(1);
        }
        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        System.out.println("Thread is: " + Thread.currentThread().getName());
    }
   
    
}
}
