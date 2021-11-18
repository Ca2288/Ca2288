
import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {
        int[] array;
        array = new int[2];
        ArrayList<String>store= new ArrayList<>();
        store.add("Beans");
        store.add("chocolate");
        store.add("bread");
        store.add("eggs");
        store.add("milk");
        System.out.println("The size of the array list is "+store.size());  
        System.out.println("The second Item on the list is "+store.get(1));
        store.remove(0);
        System.out.println("The size of the array list is now "+store.size());
          Object[] objects = store.toArray();
  
     
        for (Object obj : objects)
            System.out.print(obj + " ");
        
        
    }
    
}
