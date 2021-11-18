
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;


public class ConcurrentNavigableMapTest {
    public static void main(String[] args) {
        ConcurrentNavigableMap<String,String> ourMap= new  ConcurrentSkipListMap<>();
        ourMap.put("1","One");
        ourMap.put("2","two");
        ourMap.put("3","three");
        ourMap.put("4","four");
        ourMap.put("5","five");
        System.out.println("initial map"+ourMap.headMap("9"));
        System.out.println("head map of 3 "+ourMap.tailMap("3"));
         System.out.println("sub map of 2 "+ourMap.subMap("2","4"));
         
    }
 
}
