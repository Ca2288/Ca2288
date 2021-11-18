
public class CubbyHole {
 private   int contents;
 private Boolean available=false;
   

 public synchronized int getContents() throws InterruptedException {
     while(available==false){
         try{
         wait();
     }catch(InterruptedException ex){
             
             }
        return contents;
    }
     available=false;
     notifyAll();
     return contents;
 }
 public synchronized void setContents(int contents) {
      while(available==true){
         try{
         wait();
     }catch(InterruptedException ex){
             
        }
    }
      this.contents=contents;
     available=true;
     notifyAll();
        this.contents = contents;
    }
 
}
