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
public class PSEPayment extends Payment{

    public PSEPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        JOptionPane.showMessageDialog(
            null, 
            "Pago procesado por PSE con valor de: "+ this.amount, 
            "Pago Procesado por PSE", JOptionPane.INFORMATION_MESSAGE
        );
    }
    
}
