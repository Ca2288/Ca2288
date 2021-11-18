/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

/**
 *
 * @author Student24
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      class C {
  public C() {
    System.out.print("C ");
  }
}
class B extends C {
  public B() {                     //line n1
    System.out.print("B ");
  }
}
class A extends B {
  public A() {                    //line n2
    System.out.print("A ");
  }
  public static void main(String[] args) {
    A a = new A();
  }
}
    }
    
}
