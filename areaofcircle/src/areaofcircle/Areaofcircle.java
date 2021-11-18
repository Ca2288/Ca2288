/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaofcircle;

import java.util.Scanner;

/**
 *
 * @author Student24
 */
public class Areaofcircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner scan=new Scanner(System.in);
        System.out.println("please print the value of radius");
      double r=scan.nextDouble();
      double area=r*r*3.141592;
        System.out.println("area of a circle is "+area);
    }
    
}
