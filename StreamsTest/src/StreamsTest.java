
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Stream;


public class StreamsTest {

    
    public static void main(String[] args) {
    StreamsTest s=   new StreamsTest().sum(a,b);
    Integer i=null;
    Integer j=new Integer(9);
    st.sun(optinal.ofNullable(i),Optional.ofNullable(j));
        
//       List<Product>prodlist = new ArrayList<product>();
//       prodlist.add(new Product(1,"itallian coffee",34.6));
//        prodlist.add(new Product(2,"Nescafe coffee",54.67));
//          prodlist.add(new Product(3,"jocobs coffee",76.67));
//          prodlist.add(new Product(4,"greek coffee",88.56));
//          prodlist.add(new Product(5,"french coffee",35.67));
//          prodlist.add(new Product(6,"seattle coffee",154.99.6));
//        
//        prodlist.stream().filter(p->p.getPrice()>55.00.map(product::getPrice).collect(Collector.toList));
        
        
 //   stream.filter((s)->!s.toString().contains("please").peek(s->)    
        
        
//    Path p=Paths.get("c\\temp\\theirfile.txt");
//    Stream stream= Files.lines(p);//printing everything in this file
//    stream.forEach(System.out::println); //^^^^^^^ up up
//    
    
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      //create a list of double valuers stream the values and count all the double values less than 50  
      
//      List<Double>values=Arrays.asList(123.6,4.7,605.3,56.3,21.6,596.3);
//        System.out.println("the number is 50.0");
//        Long ct=values.stream().filter(x->x<50.0).count();
//        System.out.println("count"+ct);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//create a hashmap that takes out an entery set than create a stream take out or read all the values in there
//HashMap<String,String> x= new HashMap<String,String>(1);
//x.put("Tom","Jerry");
//x.put("Caro","Moz");
//x.put("Wa","Thati");
//x.put("za","kege");
//
//        
//      x.entrySet().stream().forEach(y->System.out.println(y.getValue()));
      
   //all values ubove jerry but less than Thati   
   
//        Integer[]numbers={1,2,3,4,7,8,9};
//        Stream<Integer>theStream = Arrays.stream(numbers);
//        long ans=theStream.filter(i->i>2).count();
//        System.out.println("Answer is:"+ans);
//        theStream= Arrays.stream(numbers);
//        ans=theStream.filter(y->y<7).count();
//        System.out.println("Answer is:"+ans);
        
//       List<String>strLst=Arrays.asList("Bob","Veronica","iCaroline","Nati","Lubisi");
//     //  strLst.stream().forEach(s->System.out.printIn(s));// same as bottom
//       strLst.stream().forEach(System.out::println);//same as top
       
//    }
//    static void myMethod(String str){
//        System.out.println(str);
   // }
//    class Product{
//        int id;
//        String name;
//        double price;
//
//        int getId() {
//            return id;
//        }
//
//        void setId(int id) {
//            this.id = id;
//        }
//
//        String getName() {
//            return name;
//        }
//
//        void setName(String name) {
//            this.name = name;
//        }
//
//        double getPrice() {
//            return price;
//        }
//
//        void setPrice(double price) {
//            this.price = price;
//        }
  } public Integer sum(Optional<Integer>a,Optional<Integer>b){
      
//    a.isPresent();
//    a.get();
//    a.orElse(new Integer(0));
            System.out.println("frruit parameter has a value? "+a.isPresent());
            Integer anInt=a.orElse(new Integer(45));
            
            System.out.println("secound parameter has a value"+a.isPresent());
            if (b.isPresent()) {
                System.out.println("value is "+b.get()); 
            }
            System.out.println("b value is "+anInt);
    return anInt+b.get();
}
  
}

