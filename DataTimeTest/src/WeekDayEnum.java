
public enum WeekDayEnum {
 
  SUNDAY(10), MONDAY(11), TUESDAY(12), WEDNESDAY(13),
  THURSDAY(14), FRIDAY(15), SATURDAY(16);
  private int dayValue;

  private WeekDayEnum(int dayValue) {
    this.dayValue = dayValue;
  }
  
   public int getDayValue() {
    return dayValue;
  }
}
