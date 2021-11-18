
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;


public class XmlMecerTest {

   
    public static void main(String[] args) {
    String uri="c:\\temp\\mecermusic_namespace.xml";
 //String uri="c:\\temp\\mecermusic.xml";
       new XmlMecerTest().parseXMS(uri);{
        
    }
       
    }

    private void parseXMS(String uri) {
        System.out.println("Going to parse"+ uri);
        try {
            XMLReader parser =XMLReaderFactory.createXMLReader();
            parser.setContentHandler(new MyContentHandler());
            parser.setErrorHandler(new MyErrorHandler());
            parser.parse(uri);
            System.out.println("yipppe. parse successful");
        } catch (SAXException |IOException ex) {
            System.out.println("Error"+ex.getMessage());
            
        }
        
    }
    
}
