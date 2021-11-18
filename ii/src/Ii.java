/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student24
 */
public class Ii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int jj=7;
       
        for (int iii=0 ; iii < jj - 1; iii+=2) { /// you have not assigned jj to anything hence the output '7 7 7'
            System.out.println(iii);
        }
        
        
        int ii=0;
        while(ii<jj-1){
            System.out.println(ii);
            ii+=2;
        }
    }
    
}
