
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class CollectionTest {

    
    public static void main(String[] args) {
//        Map<String,String> map=new HashMap<>();
//        map.put("a","caroline");
//         map.put("b","lubisi");
//         map.put("c","Brandon");
//          map.put("d","katlego");//put not .add
//           map.put("e","Onthatile");
            Map<Foo,String> map=new HashMap<>();
           map.put( new Foo(9),"ang");
            map.put( new Foo(2),"big foot");
            map.put( new Foo(3),"brandon");
           for(Foo key :map.keySet()){
               System.out.println("the key is: "+ key +map.get(key)); 
           }
//          for(String key: map.keySet()){
//              System.out.println("the key is "+key+"and the value is"+ map.get(key));
//          }
//          System.out.println("----------------------------------------");
//          map.remove("c");
//          for(String key: map.keySet()){
//              System.out.println("the key is:"+key+"and the value is "+map.get(key));
//          }
//        ArrayList ar=new ArrayList();
//        ar.add(new Integer(9));
//       ar.add(new Integer(7));
//       ar.add(new Integer(5));
//       ar.add("bob");
//       Iterator it = ar.listIterator();
//       while(it.hasNext()){
//           Integer 1=(Integer) it.next();
//           System.out.println(Integer.toHexString(1));
           
       }
    } class Foo {
        private int value;
        @Override
        public int hashCode(){
            return (value*3)^(value*19);
            
        } 
     public   Foo (int value){
            this.value=value;
        }
        @Override
        public boolean equals(Object obj){
            if(obj instanceof Foo){
            Foo f=(Foo)(obj);
            return this.value==f.getValue();
        }
            return false;
        }
        @Override
        public String toString(){
            return ""+value;
        }
        
    }
    

