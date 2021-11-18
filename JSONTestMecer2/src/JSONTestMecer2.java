
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;


public class JSONTestMecer2 {

   
    public static void main(String[] args) throws IOException {
       ObjectMapper objectMapper= new ObjectMapper();
       Person person =objectMapper.readValue(new File("c:\\temp\\ourJson.json"),Person.class);
        System.out.println(person);
        Vehicle v=objectMapper.readValue(new File("c:\\temp\\Vehicle.json"),Vehicle.class);
        System.out.println(v);
    }
    
}
