/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mecer.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student24
 */
public class BeerExpertImplementation implements BeerExpert {
   
    @Override
    public List getBrand(String colour) {
        List<String> brands = new ArrayList();
    if (colour.equalsIgnoreCase("amber")) {
   brands.add("Stella artois");
   brands.add("windhoek");
   
}else if(colour.equalsIgnoreCase("Light")){
    brands.add("Stella artois");
    brands.add("Stella artois");
}else{
    brands.add("corona");
    brands.add("black label");
    brands.add("castle");
}
 return brands;   
}
}