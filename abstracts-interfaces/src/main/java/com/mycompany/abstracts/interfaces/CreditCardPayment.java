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
public class CreditCardPayment extends Payment implements Refundable{
    
    public CreditCardPayment(double amount){
        super(amount);
    }

    @Override
    public void processPayment() {
        JOptionPane.showMessageDialog(
            null, 
            "Pago procesado por tarjeta de credito con valor de: "+ this.amount, 
            "Pago Procesado", JOptionPane.INFORMATION_MESSAGE
        );
    }

    @Override
    public void refund(double amount) {
        JOptionPane.showMessageDialog(
            null, 
            "Pago reembolsado para tarjeta de credito con valor de: "+ amount, 
            "Pago Reembolsado", JOptionPane.WARNING_MESSAGE
        );
    }
    
}
