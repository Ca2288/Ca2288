/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student24
 */
public class Clock {
 private Display hours;
private Display minutes;
public Clock(){
    this.hours=new Display(23,0,0);
    this.minutes=new Display(59,0,0);
    
}

public void run(){
  while (true) {
      seconds.incrementDisplayValue();
  } 
    if (seconds.getCurrentDisplayValue()==0) {
        
    }
  minutes.incrementDisplayValue();
    if (minutes.getCurrentDisplayValue()==0) {
      hours.incrementDisplayValue();
    }
    System.out.println(hours.getCurrentDisplayValue()+":"+minutes.getCurrentDisplayValue());
    
}

}
