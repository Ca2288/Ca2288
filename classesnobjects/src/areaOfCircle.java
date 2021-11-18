/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student24
 */
public class areaOfCircle {
    
    private double radius;
    private final double p1=3.14159;
public areaOfCircle(double raduis){
    this.radius=raduis;
}
    double getRadius() {
        return radius;
    }

  public  void setRadius(double radius) {
        this.radius = radius;}
  public double calculateArea(){
        double raduis;
    return radius*radius*3.14159;  
    
  }
        
  }
    

   
