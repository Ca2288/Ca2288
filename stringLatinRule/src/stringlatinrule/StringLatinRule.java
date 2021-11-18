/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringlatinrule;

import static java.lang.Character.toUpperCase;

/**
 *
 * @author Student24
 */
public class StringLatinRule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String first = "stuart";
        String last = "fripp";
        String name = first.toLowerCase();
        String surn = last.toLowerCase();

        //this is for first string
        String substr = first.substring(1, 6);
       String firstLetStr = substr.substring(0,1);
        firstLetStr = firstLetStr.toUpperCase();
        System.out.println(firstLetStr + substr + "say");
        //this is for the second string
        String sec = last.substring(1, 5);
   
        System.out.println(sec + "fay");

    }

}
