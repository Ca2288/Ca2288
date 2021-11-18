
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.DAYS;
import java.time.temporal.Temporal;

public class DataTimeTest {

  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    System.out.println("Date is " + date);
    LocalTime time = LocalTime.now();
    System.out.println("Time: " + time);
    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println("Date Time: " + dateTime);
    //-------------------------------------------
    LocalDate date1 = LocalDate.of(2011, 7, 6);
    System.out.println("Date1 is " + date1);
    LocalTime time1 = LocalTime.of(1, 45, 35, 958746789);
    System.out.println("Time1 is " + time1);
    //-------------------------------------------
    time1 = time1.plusHours(10);
    System.out.println("Time1 is " + time1);
    date1 = date1.plusMonths(10);
    System.out.println("Date1 is " + date1);
    System.out.println("Is leap year: " + date1.isLeapYear());
   // long days =DAYS.between(date1,date);
   // System.out.println("Number of days "+days);
    date1 = date1.minusDays(10);
    System.out.println("New Date1 is " + date1);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd~MM~yyyy");
    System.out.println("New Date1 is " + date1.format(dtf));
    Period period = Period.ofDays(8);
    Temporal temp = period.addTo(LocalDate.now());
    System.out.println("Temp is: "+temp);
  }

}
