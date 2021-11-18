
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;


public class ForkJoinTest {
    public static void main(String[] args) {
        int nCore = Runtime.getRuntime().availableProcessors();
        System.out.println("Processors:"+nCore);
        int[]numbers=new int[10000];
        for (int i = 0; i < numbers.length; i++) {
           numbers[i]=i; 
        }
        ForkJoinPool fjp = new ForkJoinPool(nCore);
        Long result =fjp.invoke(null);
        System.out.println("the result is : "+result);
    }
  
}
class Sum extends RecursiveTask<Long>{
  private int[]arr;
  private int low, high;
  public Sum(int[]arr,int low,int high){
     this.arr=arr;
     this.low=low;
     this.high=high;
  }
    
   @Override
   protected Long compute(){
       if (high-low<=10) {
          long sum=0;
          for (int i = 0; i < high; i++) {
          sum+=arr[i];
       }
          return sum;
       }
       int mid=low+(high-low)/2;
       Sum left =new Sum(arr,low,mid);
       Sum right=new Sum(arr,mid,high);
       left.fork();
       long rightRes=right.compute();
        long leftRes=left.compute();
        return leftRes +rightRes;
   } 
}