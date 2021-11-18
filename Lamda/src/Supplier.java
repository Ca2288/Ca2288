
import java.util.ArrayList;
import java.util.List;


public class Supplier {
   
    public static void main(String[] args) {
   
        new _OurSupplier().letsGo();
    }
    private void letsGo(){
        
    }
    
    
    
    
//    List<String> myList= new ArrayList();
//    myList.add("today is friyay");
//     myList.add("please vote on monday");
//      myList.add("yumm--good luck fr the oca on tuesday");
//      thierCoolMetho(()-> Arrays.asList("Today is friyay","please vote on monday","yumm--good luck fr the oca on tuesday"));
    
//         _OurSupplier os = ()-> {return "today is friyay";};    
//        System.out.println(os.get());


thierCoolMethod(()-> "please vote on monday");
thierCoolMethod(()->"C");
thierCoolMethod(()->"yumm--good luck fr the oca on tuesday");
    
    
    }
    private void thierCoolMethod (Supplier<List> ous) {
     System.out.println(ous.get());

    }
    
    private void ourCoolMethod (_ourSupplier ous) {
        System.out.println(ous.get());
}
@FunctionalInterface
interface _OurSupplier{
public String get();

}
//@FunctionalInterface
//interface _OurBiSupplier{ // cant have a by suppllier
//public String get();
//}