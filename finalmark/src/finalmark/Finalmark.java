/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalmark;

import java.util.Scanner;

/**
 *
 * @author Student24
 */
public class Finalmark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your mark");
        int mark = scan.nextInt();

        if ((mark >= 90) && (mark <= 100)) {
            System.out.println("A");
        } else if ((mark <= 89) && (mark >= 80)) {
            System.out.println("B");
        } else if ((mark <= 79) && (mark >= 60)) {
            System.out.println("C");
        } else if ((mark <= 59) && (mark >= 50)) {
            System.out.println("D");
        } else if (mark < 50) {
            System.out.println("Fail");
        }
    }
}
