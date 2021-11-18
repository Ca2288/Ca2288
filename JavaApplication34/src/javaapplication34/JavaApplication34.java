/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;


public class JavaApplication34 {
String myStr ="7007";
public void doStuff(String str){
    int myNum =0;
    try{
        String myStr =str;
        myNum =Integer.parseInt(myStr);
        
        
    }catch(NumberFormatException ne){
        System.err.println("error");
    }
    System.out.println("myStr: "+myStr+",myNum: "+myNum);
}
    
    public static void main(String[] args) {
     JavaApplication34  obj = new JavaApplication34() ;
      obj.doStuff("9000");
    }
    
}
