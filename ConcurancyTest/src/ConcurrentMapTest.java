
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


public class ConcurrentMapTest {
    public static void main(String[] args) {
        Map<String,String>map = new ConcurrentHashMap<>();
        map.put("1", "one");
         map.put("2", "two");
          map.put("3", "three");
           map.put("4", "four");
            map.put("5", "five");
            System.out.println("---------- printing out original map--------------");
            for (String s:map.keySet()) {
                System.out.println(map.get(s));
        }
            Iterator<String> itr =map.keySet().iterator();
        
            
                while(itr.hasNext())
                    String st =itr.next();
                if (st.equals("4")) {
                   map.put("6", "six")
                }
            }
    }
  

