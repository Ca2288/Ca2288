
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;


public class MyErrorHandler implements ErrorHandler {

    @Override
    public void warning(SAXParseException exception) throws SAXException {
        System.out.println("warning" +exception);
    }

    @Override
    public void error(SAXParseException exception) throws SAXException {
        System.out.println("error"+exception);
    }

    @Override
    public void fatalError(SAXParseException exception) throws SAXException {
        System.out.println("fatalError"+exception);
    }
    
}
