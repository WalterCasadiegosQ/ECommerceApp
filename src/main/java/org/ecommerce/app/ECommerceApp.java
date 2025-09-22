package org.ecommerce.app;

import org.ecommerce.processor.PaymentProcessor;

public class ECommerceApp {
    private PaymentProcessor processor;

    public void setProcessor(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void checkout(double amount) {
        if (processor == null) {
            System.out.println("⚠️ No se ha seleccionado un método de pago.");
        } else {
            processor.processPayment(amount);
        }
    }
}
