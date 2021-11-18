
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student24
 */
public class SetTestClass {
    public static void main(String[] args) {
        Set<String> mySet=new HashSet<>();
        mySet.add("a");
        mySet.add("a");
        mySet.add("b");
        mySet.add("c");
        mySet.add("c");
        mySet.add("b");
        mySet.add("ad");
        
        System.out.println(""+mySet.size());
        for(String s : mySet){
            System.out.println("val: "+s); 
        }
    }
}
