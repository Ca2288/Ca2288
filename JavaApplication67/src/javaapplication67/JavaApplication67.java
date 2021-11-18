/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication67;

import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author Student24
 */
public class JavaApplication67 {

    /**
     * @param args the command line arguments
     */
 try (FileReader fileReader = new FileReader("zoo-data.txt");
      BufferedReader bufferedReader = new BufferedReader(fileReader)) {
     try {
         System.out.println(bufferedReader.readLine());
     } catch (IOException ex) {
         Logger.getLogger(JavaApplication67.class.getName()).log(Level.SEVERE, null, ex);
     }
}

}