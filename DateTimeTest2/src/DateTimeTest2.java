
import static com.sun.org.glassfish.external.amx.AMXUtil.prop;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import static java.lang.System.out;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import static java.util.concurrent.TimeUnit.DAYS;
import static java.util.concurrent.TimeUnit.HOURS;

public class DateTimeTest2 {

   
    public static void main(String[] args) {
       ResourceBundle rb=ResourceBundle.getBundle("OurFile"); 
        System.out.println("Message: default local"+rb.getString("how are you"));
        Locale.setDefault(new Locale("fr","CA"));
        rb=ResourceBundle.getBundle("ourFile");
        System.out.println("message new local"+rb.getString("how are you"));
        System.out.println("otherfile"+rb.getString("apa khabar"));
        
     //   prop.forEach(a,v->System.out.println("key is:"+k+ "value in: "+v));
//        try{
//     prop.load(new FileReader("c:\\temp\\config.properties"));
//        }catch(FileNotFoundException ex){
//        }catch(IOException ex){
//        }
        
//   Properties prop =new Properties();
//   prop.setProperty("un", "Fred");
//    prop.setProperty("pw", "3iE10");
//   prop.setProperty("ip", "192.168.122.98");
//   try{
//   prop.store(new FileWriter("c:\\temp\\config.properties"),"MIE's first Java prop");
//   }catch(IOExcepton ex) {
       
        
//    Locale loc=new Locale.getDefault();    
//        System.out.println("loc");  
//        Locale.setDefault(new Locale("fr","CA"));
//        loc=Locale.getDefault();
//        System.out.println(loc);
        
//         Locale loc=new Locale.Builder().setLanguage("zh").setRegion("CN").build();
//        System.out.println(loc);
        
        
        
//        Locale loc=new Locale("fr","US");
//        System.out.println(Locale.CHINA);
        
        
        
        
//        LocalDate ld=LocalDate.now();
//        ld=ld.plusDays(2).plusMonths(2);
//        System.out.println(ld);
//        
        
        
       //  Period aDay =Period.ofWeeks(2);
//       Duration aDay =Duration.ofHours(12);
//         System.out.println("period of two days"+aDay);
//         LocalTime ldt3=LocalTime.of(15,14);
//         System.out.println("time difference"+ldt3);
//          LocalDateTime ldt =LocalDateTime.now();
//         LocalDateTime ldt1 =LocalDateTime.now();
//          System.out.println("today is"+ldt);
//            System.out.println("test date is: "+ldt1);
            
            
//        Instant thisMoment=Instant.now();
//        Period aDay =Period.ofWeeks(2);
//        try{
//        Thread.sleep(0,1);    
//        }catch (InterruptedException ex){
//            }
//        Instant newMoment = Instant.now();
//        System.out.println("is old before new"+oldMoment.isBefore(newMoment));
//        System.out.println("old:"+oldMoment);
//         System.out.println("old:"+newMoment);
        
//        LocalDateTime ldt =LocalDateTime.now();
//         LocalDateTime ldt1 =LocalDateTime.of(2021,12,25,0,0);//65 days till christmas
//         ZonedDateTime zdt = ZonedDateTime.of(ldt,ZoneId.of("Asian/Chungking"));
//         System.out.println("Days between: "+HOURS.between(ldt1,ldt));
         
         
         
//         ZonedDateTime zdt1 = ZonedDateTime.of(ldt,ZoneId.of("US/Pacific"));
//          System.out.println("now there:" +zdt1.isBefore(zdt));    
//             zdt=zdt.plusHours(45);
    
       
                //System.out.println("now here:" +ldt);
              //ZoneId.getAvailableZoneIds().stream().sorted().forEach(System.out);
                
        
//         LocalDateTime ldt=LocalDateTime.now();
//          ldt= idt.
//                  
//      LocalDateTime ldt3=LocalDate.of(1843,Month.FEBRUARY,29);
      //
         // LocalTime ldt=LocalTime.parse("16:04:20");
//       System.out.println("local date time:"+ldt);
       
        // new DateTimeTest
       
//       private void go(){
      //    LocalDate ldt=LocalDate.of(1643, 4,20);
         // System.out.println("local date time:"+ldt);
//           DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM*yyyy*dd";
//           System.out.println("Local Date time:"+idt.format.(dtf));
//            DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("MM*yyyy*dd";
//           System.out.println("Local Date time:"+idt.format.(dtf1,./));
//           
           
//        ldt = ldt.plusHours(45);
//           System.out.println("Local date time"+ldt);
//           // ldt = ldt.plusMonths(3);
//           LocalDate ld=LocalDate.now();
//           System.out.println("date is"+ld);
//           ld=ld.
           
//         LocalTime time1=LocalTime.now();
//         out.printIn("the time is:"+time1);
//          LocalDate date1=LocalDate.now();
//         out.printIn("the dateis:"+date1);
//         
//         LocalDateTime ldt1 =LocalDateTime.now();
//         out.printIn("date time is"+ldt1);
//          LocalDateTime ldt2= LocalDateTime.of(date1, time1);
//            out.printIn("Date time is:"+ldt2);
//            
//            LocalDateTime ldt3=LocalDate.of(1843,Month.FEBRUARY,29);
//           out.printIn("Date long ago is:"+ldt3);
//         //  System.out.println("is the date a leap year:"+  LocalDate date3=LocalDate.of(1840,2,12sout));
//         
//        out.printIn("Date ld3 before id2"+ ld3=isBefore.of(ld2));
//        out.printIn("Date ld3 at start of day"+ ld3.atstartofday());
//        Localdate ld4=LocalDate.of(12, 11, 23)

       }
     
    }
    
}
