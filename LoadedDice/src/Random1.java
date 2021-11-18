
import java.util.Random;



public class Random1{
public static void printDiceRolls(Random randGenerator){
for (int i = 0; i < 100; i++){
    System.out.print(randGenerator.nextInt(6) + 1);
    }
}

public static void main(String[] args){
Random randGenerator = new Random();
printDiceRolls(randGenerator);
LoadedDice ld = new LoadedDice();
printDiceRolls1(ld);

    }

    private static LoadedDice printDiceRolls1(LoadedDice ld) {
        return ld;
    }
}
class LoadedDice extends Random1{
 public static void printDiceRolls1(LoadedDice ld,Random randGenerator) {
        System.out.println("Hello");
        for (int i = 0; i < 50; i++)
{
    System.out.print("The loaded dice is " +" " +  randGenerator.nextInt(6) + 1 + ld);
        
        }
    }
}