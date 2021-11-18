
package sinewave;


public class SineWave {

static void printSinWave(int wave_height,
                         int wave_length)
{
    // inner space and outer space.
    int is = 1, os = 2;
 
    // for loop for height of wave
    for (int i = 1;
             i <= wave_height; i++)
    {
 
        // for loop for wave length
        for (int j = 1;
                 j <= wave_length; j++)
        {
 
            // intermediate spaces
            for (int k = 1; k <= os; k++)
            {
                System.out.printf(" ");
            }
 
            // put any symbol
            System.out.printf("0");
 
            for (int k = 1; k <= is; k++)
                System.out.printf(" ");    
 
            // put any symbol
            System.out.printf("0");
 
            for (int k = 1; k <= os; k++)
                System.out.printf(" ");
             
            System.out.printf(" ");
        }
 
        // set a value of os to 1 if i+1 
        // is not equal to wave height
        // or 0 otherwise
        os = (i + 1 != wave_height) ? 1 : 0;
 
        // set value of is to 3 if i+1 is not 
        // equal to wave height or 5 otherwise
        is = (i + 1 != wave_height) ? 3 : 5;
 
        System.out.printf("\n");
    }
}
 
// Driver code
public static void main(String []args)
{
    int wave_height = 21, wave_length = 10;
    printSinWave(wave_height, wave_length);
}
}


