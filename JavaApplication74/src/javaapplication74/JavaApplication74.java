/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication74;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Student24
 */
public class JavaApplication74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Path path1 = Paths.get("/pets/../cat.txt");
Path path2 = Paths.get("./dog.txt");
System.out.println(path1.resolve(path2));
System.out.println(path2.resolve(path1))
    }
    
}
