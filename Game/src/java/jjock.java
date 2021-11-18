
import org.json.simple.JSONArray;


public class jjock {
 private  String catagory;
private   String jock;

    public jjock(String catagory, String jock) {
        this.catagory = catagory;
        this.jock = jock;
    }public static void main(String[] args) {
         JSONArray arr = new JSONArray(); 
         arr.add(new jjock("jocks","pickOne"));
         arr.add(new jjock("traffic light", "what did the traffic light say to the other? stop looking am changing"));
          arr.add(new jjock("why","why was the easter burny so upset? he was having a bad hay day"));
          arr.add(new jjock("Sing","why couldn't the pony sing a lalaby? she was a little horse"));
         arr.add(new jjock("karate","What do you call a pig that does karate? a porkchop"));
         for (Object obj : arr){
             System.out.println(obj);
         }

//       jjock j=new jjock("jock","jock");
//        j.setCatagory("Trafic light");
//       j.setCatagory("Why");
//       j.setCatagory("Sing");
//       j.setCatagory("karate");
//       j.getCatagory();
//     System.out.println(j);
            
     
      
            
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getJock() {
        return jock;
    }


    public void setJock(String jock) {
       this.jock = jock;
   }

    @Override
    public String toString() {
        return "catagory: " + catagory 
             + "\njock: " + jock;
    }
   
}
