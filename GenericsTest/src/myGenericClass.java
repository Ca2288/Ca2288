
public class myGenericClass<T> {// changing the letter T to C still makes the program run.
 private T value;  

public myGenericClass(T value){
    this.value=value;
}
 public void printStuff(){
     System.out.println("type is :"+value.getClass().getName()+"WHOSE VALUE IS:" +value);
 }
}

