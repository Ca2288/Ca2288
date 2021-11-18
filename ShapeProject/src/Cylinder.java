/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student24
 */
public class Cylinder extends Circle{
    double height;
    public Cylinder(double radius,double height){
      super(radius);
      this.height=height;
    }
    @Override
  public double calculateArea();  

  double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }
  
}
