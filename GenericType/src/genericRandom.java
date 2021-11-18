
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class genericRandom<c> {
c[] value;

    public genericRandom(c[] value) {
        this.value =value;
    }
   public void print() {
            System.out.println("Your movie choice is "+getValue()+" Enjoy your movie night "+getValue());
}
   //////////////////////////////box 1////////////////////////////////
   public<U extends String > String addMovie(U[] movie){

     Scanner scan=new Scanner(System.in);  
       System.out.println("please input four of your favourite movies");
      String opt=scan.nextLine();
       String opt1=scan.nextLine();
       String opt2=scan.nextLine();
       String opt3=scan.nextLine();
       
        String choice []={opt,opt1,opt2,opt3};
        
       System.out.println("your first movie choice is " + opt);
      System.out.println("your secound movie choice is "+opt1);
      System.out.println("your thired movie choice is "+opt2);
      System.out.println("your fourth movie choice is "+opt3);
      for(String s : choice ){
       System.out.println(s);
    }
 }
/////////////////////////////box 2//////////////////////////////
   public void addMovie2(){

     Scanner scan=new Scanner(System.in);  
       System.out.println("please input four of your favourite movies");
       String opt=scan.nextLine();
       String opt1=scan.nextLine();
       String opt2=scan.nextLine();
       String opt3=scan.nextLine();
       
       String choice []={"titanic","Den of thieves","Scream","Scary movie"};
         
      for(String s : choice ){
       System.out.println(s);
    }
 }
   
////////////////////////box 3/////////////////////////////////
   public String isEmpty(String zero){
       System.out.println("The box is empty");
    return  zero = null;
///////////////////////////////////////////////////////////////   
   }
   private void drawItem(){
       java.util.Random random = new java.util.Random();
      // String choice []={opt1,opt2,opt3};String avmov[]={};
}

   c getValue() {
        return value;
    }

    void setValue(c value) {
        this.value = value;
    }
}
      
 class Generic1 {       
    public static void main(String[] args) {  
        
     genericRandom<String> g1 =  new genericRandom<>(choice);
        Scanner scan = new Scanner(System.in); 
     int user = scan.nextInt();
        switch(user){
            case 1:
                g1.
        } 
    }
}