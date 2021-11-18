

public class Consumer extends Thread {
       private CubbyHole cubbyhole;
private int num;
    public Consumer(CubbyHole cubbyhole,int num) {
        this.cubbyhole=cubbyhole;
        this.num=num;
    }
       @Override
    public void run(){
        for(int i=0;i<10;i++){
            try {
                num = cubbyhole.getContents();
            } catch (InterruptedException ex) {
              
            }
System.out.println("#Producer:"+num+i);

        }
    }
}
