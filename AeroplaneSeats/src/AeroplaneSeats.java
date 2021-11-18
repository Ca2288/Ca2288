
import java.util.Scanner;

public class AeroplaneSeats {

    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4", "5", "6", "7"},
         {"A", "B", "C", "D"}};
//        Scanner scan=new Scanner(System.in);
//        System.out.println("seats taken");
//        scan.nextLine();
        ////////////////////////////////////////////  
        
//        for (String[] a : array) {
//            for (int i = 0; i < array.length - 1;) {
//                System.out.print(a[i]);
//                    i++;
////                    for (int k = 0; i < array[i].length - 1;) {
////                        System.out.print(a[k]);
////                            k++;
//                    }
//               }
//            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println();
        }
        }
    }
