
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;


public class MyContentHandler implements ContentHandler {
private Locator locator;

    @Override
    public void setDocumentLocator(Locator locator) {
        System.out.println("************* setDocumentLocator called,");
        this.locator=locator;
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("====================  startDocument called. End of document.========");
    }

    @Override
    public void endDocument() throws SAXException {
         System.out.println("====================  endDocument called. End of document.========");
    }

    @Override
    public void startPrefixMapping(String prefix, String uri) throws SAXException {
       System.out.println("mapping starts for prefix"+prefix+"which is associated with"+uri);
    }

    @Override
    public void endPrefixMapping(String prefix) throws SAXException {
         System.out.println("mapping starts for prefix"+prefix);
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
         System.out.println("at start of element:"+localName);
         if (!uri.equals("")) {
             System.out.println("is namespace"+uri+("raw name of:"+qName));
             
        }else{
             System.out.println("with no namespace");
         }
         for (int i = 0; i<atts.getLength(); i++) {
             System.out.println("attributes"+atts.getLocalName(i)+"="+atts.getValue(i));
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.print("end of Elemet");
        if (!uri.equals("")) {
             System.out.println("is namespace"+uri+("raw name of:"+qName));
             
        }else{
             System.out.println("with no namespace");
         }
        
       
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println("Characters: "+new String(ch,start,length));
    }

    @Override
    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
        System.out.println("ignore white space: "+new String(ch,start,length));
    }

    @Override
    public void processingInstruction(String target, String data) throws SAXException {
        System.out.println("PI: Target"+target+"end the data"+data);
                
    }

    @Override
    public void skippedEntity(String name) throws SAXException {
        System.out.println("SkippedEntitiy" +name);
    }
    
}
