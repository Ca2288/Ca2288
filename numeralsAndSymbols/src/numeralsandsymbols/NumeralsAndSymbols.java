/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeralsandsymbols;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Student24
 */
public class NumeralsAndSymbols {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] arr = new String[10];

        arr[0] = "*";
        arr[1] = "B";
        arr[2] = "E";
        arr[3] = "A";
        arr[4] = "@";
        arr[5] = "F";
        arr[6] = "K";
        arr[7] = "%";
        arr[8] = "R";
        arr[9] = "M";
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter number from 0 to 9");
       
        int mark = scan.nextInt();
         //System.out.println(Arrays.toString(arr));
        System.out.println("your secret code is " + arr[mark]);
        
        
     

    }

}
