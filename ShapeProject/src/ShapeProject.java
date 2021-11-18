/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Student24
 */
public class ShapeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        double a;
        a=r.area(50,20, 30);
        System.out.println("the area of a rantangle is"+a);
        private void runMe(){
            Circle circle =new Circle(10);
            
            System.out.println("my are is:"+circle.circleArea());
            circle.whoAmI();
        }
    }
    
}
