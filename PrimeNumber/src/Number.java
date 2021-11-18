/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student24
 */
public class Number {

    boolean isPrime(int number) {
        boolean retVal = true;
        int var = 2;
       
        if(number<1){
            return false;
        }

        while (var <= number) {
            if (number % var == 0 && var != number) {
                retVal = false;
                break;
            }
            var++;
        }
        return retVal;
    }
}
