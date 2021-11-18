/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetimetest;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import static java.util.concurrent.TimeUnit.DAYS;

/**
 *
 * @author Student24
 */
public class DateTimeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LocalDate Date= LocalDate.now();
        System.out.println("date is "+Date);
        LocalTime time= LocalTime.now();
        System.out.println("time:"+time);
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println("date Time "+dateTime);
        
      LocalDate date1 =LocalDate.of(2011, 7, 6);//or month.7
        System.out.println("date is " +date1);
        LocalTime time1 =LocalTime.of(1,45,35,958746789);
        System.out.println("time is "+time1);
        time1=time1.plusHours(10);//assign time1 course immutable
        System.out.println("Time is "+time);
        date1=date1.plusMonths(10);
        System.out.println("Date is "+date1);
        System.out.println("Is leap year: "+date1.isLeapYear());
//        long days=DAYS.between(date1,date);//not in exam
//        System.out.println(""+days);
        date1=date1.minusDays(10);
        System.out.println("New date is "+date1);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("New date is "+date1.format(dtf));
        Period period =Period.ofDays(8); //period of 8 days
        Temporal temp = period.addTo(LocalDate.now());  // not for the oca exam
        System.out.println("Temp is "+temp);
        
    }
    
}
