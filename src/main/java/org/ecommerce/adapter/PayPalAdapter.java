package org.ecommerce.adapter;

import org.ecommerce.processor.PaymentProcessor;
import org.ecommerce.services.PayPalService;

public class PayPalAdapter implements PaymentProcessor {

    private PayPalService payPalService;

    public PayPalAdapter() {
        this.payPalService = new PayPalService();
    }

    @Override
    public void processPayment(double amount) {
        payPalService.doPayment(amount);
    }

}
