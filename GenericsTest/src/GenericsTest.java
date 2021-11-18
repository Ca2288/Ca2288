
public class GenericsTest {

    
    public static void main(String[] args) {
        System.out.println("------------------ not using generics-----------------------");
       // MyIntegerClass mic =new MyIntegerClass();
        System.out.println("-------  using generics");
        myGenericClass<Integer> mgc = new  myGenericClass<Integer>(34);
        mgc.printStuff(); 
        myGenericClass<Double> mgc1 = new  myGenericClass<Double>(36.9);
        mgc1.printStuff();
         myGenericClass<Long> mg1 = new  myGenericClass<Long>(3456739L);
         mg1.printStuff();
       // MyGenericClass<Integer,Double> mg2=new MyGeneric2Class
    }
    
}
