/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

/**
 *
 * @author Student24
 */
public class Time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double time=50.391;   
    double hours=3600;
     double min=60;
     
  double t=time/hours;
  double m=hours/min;
    double p=t%m;
        System.out.println(" hours equals "+(int)+t);
        System.out.println("minutes equal "+(int)+m);
        System.out.println("second equal "+(int)+p);
    }
    
}
