/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstracts.interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class AbstractsInterfaces {

    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment(100.0);
        
        Payment psePayment = new PSEPayment(50.00);
        
        System.out.println("==== Iniciando Proceso de Pago ====");
        
        
        creditCardPayment.processPayment();
        
        startRefund(creditCardPayment);
        startRefund(psePayment);
        
    }
    
    public static void startRefund(Payment payment){
        if(payment instanceof Refundable) {
            ((Refundable) payment).refund(20);
        }else{
            JOptionPane.showMessageDialog(
                null, 
                "NO es permitido hacer reembolso de este pago", 
                "Reembolso Rechazado", 
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
