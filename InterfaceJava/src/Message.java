
 public class Message {
    String txt;
 
    public String toString(String txt) {
     
        return txt; 
        
 }
    String setTxt(String txt) {
        this.txt = txt;
        return txt;
    }
    String getTxt() {
        return txt;
    }
    public static void main(String[] args) {
        String alpha = "This is Java";
       
        alpha = alpha.replace('a', 'b');
        alpha = alpha.replace('i', 'j');
        alpha = alpha.replace('s', 't');
        alpha =alpha.replace('T', 'U');
        alpha =alpha.replace('v', 'w');
        alpha =alpha.replace('h', 'i');
        alpha =alpha.replace('J', 'K');
        System.out.println(alpha);
        
        Email em = new Email("Caroline ","Onthatile ","Weekend Plans " );
        Sms sms=new Sms();
        sms.setRecipientContactNo("066");
        System.out.println(sms.getRecipientContactNo());
        System.out.println(em.reciever);
        
    }

}
class bool{
    public static boolean ContainsKeyword(Message messageObject, String keyword){
    if (messageObject.toString().indexOf(keyword,0) >= 0)
        return true;
    return false;
    }
}
//////////////////////////////////////////////

 class Sms extends Message{
    String recipientContactNo;

    public String Sms(String recipientContactNo) {
        this.setRecipientContactNo(getTxt()); 
        return getTxt();  
        
    }

    public String toString(String txt, String alpha) {
        return super.toString(txt.concat(getRecipientContactNo())); 
    }

    String getRecipientContactNo() {
        return recipientContactNo = "0666";
    }

    void setRecipientContactNo(String recipientContactNo) {
        this.recipientContactNo = recipientContactNo;
    }
}
///////////////////////////////////////////////////

 class Email extends Message{
     String sender;
     String reciever;
     String subject;

    public Email(String sender, String reciever, String subject) {
        this.sender = sender;
        this.reciever = txt;
        this.subject = txt;
        
    } 
    @Override
    public String toString(String txt) {
        return super.toString(txt.concat(getSender()).concat(getReciever()).concat(getSubject()));
    }

    String getSender() {
        return sender;
    }

    void setSender(String sender) {
        this.sender = "Caroline";
    }

    String getReciever() {
        return reciever;
    }

    void setReciever(String reciever) {
        this.reciever = reciever;
    }

    String getSubject() {
        return subject;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }
 }