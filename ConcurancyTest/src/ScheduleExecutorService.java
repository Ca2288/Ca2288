
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;


class ScheduleExecutorTest{
    public static void main(String[] args) {
      ScheduleExecutorService ses = Executors.newScheduledThreadPool(1);
      ScheduledFuture sf = ses.scheduleAtFixedRate(new BeepTask(),2,2,TimeUnit.SECONDS);
      
       ses.schedule(()-> {sf.cancel(true);
       ses.shutdown();},10,TimeUnit.SECONDS);
    }
 
}
class BeepTask implements Runnable{

@Override
public void run(){
    System.out.println("beeep beeep");
}
}