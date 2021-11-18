
import static java.lang.Thread.sleep;


public class ThreadsTest {

    
    public static void main(String[] args) throws InterruptedException {
        CubbyHole cubbyhole=new CubbyHole();
        Producer producer=new Producer(cubbyhole,1);
        Consumer consumer=new Consumer(cubbyhole,1);
        producer.start();
        consumer.start();
        //System.out.println("in main thread");
         // Thread bf= new BigFoot("Thabiso");// using thread
         // Runnable r=new LittleFoot("thabiso");
         // String s=(r)->{return name};
         // Thread bf= new Thread(new LittleFoot());//using runnable
         // bf.start() ;
        // Thread.sleep(1);
        // System.out.println("Goodbye");    
    }
}
//class BigFoot extends Thread{//using thread
//    private String name;
//    public BigFoot(String name){
//    this.name=name;
//}
//    @Override
//    public void run(){
//        for (int i = 0; i < 20; i++) {
//            if (i==10) 
//           try{  sleep(2);   
//           }catch(InterruptedException ex){
//           }
//            System.out.println("my name is"+name);   
//        }
//    }
//    
//}
//class LittleFoot implements Runnable{//using runnable
//   // public  LittleFoot (String name){
//       // this.name=name;
//  //}
//   @Override
//    public void run(){
//        for (int i = 0; i < 20; i++) {
//            if (i==10) 
//           try{  sleep(2);   
//           }catch(InterruptedException ex){
//           }
//            System.out.println("my name is: Bob");   
//        }
//    }
//    
//} 

