package weight;

import java.util.Scanner;

public class Weight {

    public static void main(String[] args) {
        new Weight().runMe();
    }

    private void runMe() {
        Scanner scan = new Scanner(System.in);
        boolean carryOn = true;
        while (carryOn) {
            System.out.print("Enter the mass of your dream car : ");
            double calc = scan.nextDouble();
            scan.nextLine();
            //////////////////////////////////////
            System.out.print("Earth(e) or moon(m) or any other key to exit? : ");
            /////////////////////////////////////
            String decision = scan.nextLine().toLowerCase();
            switch (decision) {
                case "earth":
                case "e":
                    double earth = calculateMassValue(calc);
                    System.out.println("The mass of your car on Earth is equal to " + earth + " KG");
                    break;
                ////////////////////////////////////////
                case "moon":
                case "m":
                    double moon = calculateMassValue(calc) / 6;
                    System.out.println("The mass of your car on Moon is equal to " + moon + " KG");
                    break;
                default:
                    System.out.println("Good Bye!!");
                    carryOn = false;
            }
        }
    }
    
    private double calculateMassValue(double value){
        return (value * 1 * 9.81) * 2;
    }
}
