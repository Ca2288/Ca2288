
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JsonMecerTest {

    
    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException {
      new  JsonMecerTest().jsonTest();
     
    }
    private void jsonTest() throws IOException, FileNotFoundException, ParseException{
       JSONObject myobject = new JSONObject();
       myobject.put("name","Brandon");
       myobject.put("age",20);
       JSONArray messages=new JSONArray();
       messages.add("hey there!");
        messages.add("whats up mecer people!!!!");
        myobject.put("ourMessage",messages);
        
//        System.out.println("our JSON"+myobject);
        Files.write(Paths.get("c:\\temp\\ourJson.json"),myobject.toJSONString().getBytes());
        
        jsonTestRead();
    }
    private void jsonTestRead() throws FileNotFoundException, IOException, ParseException{
        FileReader reader = new FileReader("c:\\temp\\ourJson.json");
        JSONParser parser= new JSONParser();
        JSONObject value =(JSONObject) parser.parse(reader);
        System.out.println(value.toString());
        System.out.println(value.get("name")+"is of age:"+value.get("age"));
       // System.out.println(value.get("ourMessage").toString());
        ArrayList mesg =(ArrayList)value.get("ourMessage");
        mesg.forEach(System.out::println);
        
    }
}
