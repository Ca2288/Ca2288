/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student24
 */
public enum WeekDayEnum {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,FRIDAY, SATURDAY;
    int dayValue;
    private WeekDayEnum(int dayvalue){
        this.dayValue=dayValue;
    }
}
