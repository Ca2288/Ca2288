/public class MyGeneric2Class<T> {// changing the letter T to C still makes the program run.
 private T value;  
private u name;
public MyGeneric2Class(T value, u name){
    this.value=value;
    this.name=name;
}
 public void printStuff(){
     System.out.println("type is :"+value.getClass().getName()+"WHOSE VALU IS:" +value.getClass()+_"and name is"+name);
 }
}