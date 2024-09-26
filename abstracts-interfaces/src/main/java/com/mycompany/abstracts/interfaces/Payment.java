/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstracts.interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
abstract class Payment {
    
    protected double amount;
    
    public Payment ( double amount ) {
    
        this.amount = amount;
        
    }
    
    
    public void printReceipt(){
        
        String message = "El pago de la factura es de $" + this.amount;
        
        JOptionPane.showMessageDialog(null, message);
    }
    
    
    public abstract void processPayment();
    
}
