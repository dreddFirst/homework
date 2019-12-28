/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex11_7;

/**
 *
 * @author treba
 */
public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;
    
    Invoice(){};
    Invoice(String n, String d, int q, double p){
        setPartNumber(n);
        setPartDescription(d);
        setQuantity(q);
        setPrice(p);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0){ 
            this.quantity = 0;
        }else{
            this.quantity = quantity;
        }
        
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            this.price = 0.0;
        }else{
            this.price = price;
        }
    }
    
    double getInvoiceAmount(){
        return this.getQuantity()*this.getPrice();
    }
}
