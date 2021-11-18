/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immutabletest2;


public class Car {
    
     private  StringBuilder model;
    public Car(StringBuilder sb){
        this.model=model;
    }

    Car() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public StringBuilder getSb(){
        this.model=model;
        return new StringBuilder(model);
    }
    public void setSb(StringBuilder model){
        this.model=model;
    }
}

