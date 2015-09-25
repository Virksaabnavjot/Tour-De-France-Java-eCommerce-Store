/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tourdefranceproject;

import java.io.Serializable;

/**
 *
 * @author Navjot Singh Virk  x13112406
 */
public class BasketObject implements Serializable{
  //implementing Serializable to instansiable class because to write and read objects to/from files.We must first make the class serializable.

  //declare variables
    private String size;
    private String color;
    private int quantity;  
    
  public BasketObject(){
        //create variable
        size = new String();
        color = new String();
        quantity = 0;
        
        
        
        
}

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public int getQuantity() {
        return quantity;
    }
    
    
    
    
    
}

  