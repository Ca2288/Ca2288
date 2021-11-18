
import java.util.Scanner;


class Draw<T>{
T[] name;

    public Draw(T[] name) {
        this.name = name;
        
    }
    public <U extends String> void addString(U[] inputArrayString){
        for(String str :inputArrayString ){
            System.out.println(str); }
        
}        
 ///////////////////////////////////Box////////////////////////////////////////////
    public <S extends Number> void addInteger(S[] inputArrayInt){
        int randomIndexnums = (int)(Math.random()*inputArrayInt.length);
        Integer randomElementNums = (Integer) inputArrayInt[randomIndexnums];
        System.out.println("Random number = " + randomElementNums);} 
    
    public T[] getName() {
        return name;
    }

    public void setName(T[] name) {
        this.setName(name);
    }

//////////////////////////////////Box 2////////////////////////////////////////////
   public<T extends String> void addMovie2(T[] m2){
     
       int randomIndexnums = (int)(Math.random()*m2.length);
        String randomElementNums = (String) m2[randomIndexnums];
      System.out.println("Random movie = " + randomElementNums);
        
    } 
//////////////////////////////Empty////////////////////////////
public String isEmpty(String zero){
       System.out.println("The box is empty");
    return  zero = null;
    }

///////////////////switch boxes//////////////////////
class switchBoxes extends Draw<T>{
  
        public switchBoxes(T[] name) {
            super(name);
               
    Scanner scan=new Scanner(System.in); 
    String str = scan.nextLine();
    System.out.println("Would you ike to choose Box1 or Box2");
    switch(str){
        case "1":
       str.
    
        case "2":
            
            
            
            }
        }        
    }
}
public class GenericsExercise1 {

    public static void main(String[] args) { 
        
        String[] names = {"1.Titanic","2.Den of thieves","3.Scream","4.Scary movie"};
        Draw<String> ge = new Draw<>(names);
        ge.addString(names);
        Scanner scan=new Scanner(System.in);   
        System.out.println("Please input four of your favourite movies: ");
        String opt=scan.nextLine();
        String opt1=scan.nextLine();
        String opt2=scan.nextLine();
        String opt3=scan.nextLine();
        ge.isEmpty(opt);
        String[] m2 = {opt,opt1,opt2,opt3};
        ge.addMovie2(m2);
                           
    }   
}


