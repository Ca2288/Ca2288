
package immutabletest2;


public class Immutabletest2 {

    
    public static void main(String[] args) {
       Car car=new Car();
     StringBuilder scb =new StringBuilder("hello");
     Person p= new Person(scb); 
   
        System.out.println("sb:"+scb.toString());
        scb.append("there .");
        System.out.println("str: "+p.getSb().toString());
        // p.setSb(scb);
         System.out.println("str: "+p.getSb().toString());
         System.out.println(""+scb);
         System.out.println(".................................................");
         StringBuilder foo=p.getSb();
         foo.append("EllO");
         System.out.println("person sb: "+p.getSb().toString());
         
    }
    
    
}
final class Person{
    private final  StringBuilder sb;
    public Person(StringBuilder sb){
        this.sb= new StringBuilder(sb);
    }
    public StringBuilder getSb(){
        
        return new StringBuilder(sb);
    }
//    public void setSb(StringBuilder sb){
//        this.sb=sb;
    }


