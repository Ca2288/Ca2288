
public class TestEnum {
  public static void main(String[] args) {
    WeekDayEnum day = WeekDayEnum.SUNDAY;

    switch (day) {
      case SUNDAY:
        System.out.println("It is Sunday");
        break;
      case MONDAY:
        System.out.println("It is Monday");
        break;
      case TUESDAY:
        System.out.println("It is Tuesday");
        break;
      case WEDNESDAY:
        System.out.println("It is Wednesday");
        break;
      default:
        System.out.println("It is SOMEDAY");

    }

    WeekDayEnum[] theDayValues = WeekDayEnum.values();
    for (WeekDayEnum wd : theDayValues) {
      System.out.println("Value is: " + wd);
      System.out.println("Ordinal Value is: " + wd.getDayValue());
    }
  }
}
