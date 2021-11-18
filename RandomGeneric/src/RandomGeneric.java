 
public class RandomGeneric {

    
    public static void main(String[] args) {
       GenericString<String> pic= new GenericString<String>("Titanic");
       pic.printStuff();
        GenericString<String> pic1= new GenericString<String>("Fast Eight");
        pic1.printStuff();
         GenericString<String> pic2= new GenericString<String>("Den of Thiefs");
         pic2.printStuff();
         GenericString<String> pic3= new GenericString<String>("Candy man");
         pic3.printStuff();
         ///////////////////////////////////////////////////////////////////////////////////////////////
         GenericString<String> picOp= new GenericString<String>("");
         picOp.add();
    }
    
}
