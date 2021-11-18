/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student24
 */
public class TestEnum {
    public static void main(String[] args){
        WeekDayEnum day = WeekDayEnum.MONDAY;
//        if (day==WeekDayEnum.MONDAY) {
//            System.out.println("it is monday");
//        }
//            else{
//                    System.out.println("day unknown");
//                    }
            switch(day){
                case SUNDAY:
                    System.out.println("it is Sunday");
                case MONDAY:
                    System.out.println("it is Monday");
                 case TUESDAY:
                     System.out.println("it is Tuesday");
                      case WEDNESDAY:
                          System.out.println("it is Wednesday");
                      case THURSDAY:
                          System.out.println("it is Thursday");
                           case SATURDAY:
                               System.out.println("it is Saturday");
                            break;
                           default:
                          
                          
                          
            } 
        WeekDayEnum[]theDayValue =WeekDayEnum.values();
        for (WeekDayEnum wd:theDayValue ) {
            System.out.println("value is "+wd);
            System.out.println("oridinal value is:"+wd.ordinal());
        }
    }
    
}
