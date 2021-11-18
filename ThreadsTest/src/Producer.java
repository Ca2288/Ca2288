
public class Producer extends Thread {
    private final CubbyHole cubbyhole;
    private final int num;
    public Producer(CubbyHole cubbyhole,int num) {
        this.cubbyhole=cubbyhole;
        this.num=num;
    }

@Override
public void run(){
    for(int i=0;i<10;i++){
        cubbyhole.setContents(num+i);
            System.out.print("#Producer:"+ num + i);
    try{
    sleep((int) (Math.random() * 1000));
    }catch(InterruptedException iox){}
        }
    }
}