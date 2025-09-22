package org.ecommerce.adapter;

import org.ecommerce.processor.PaymentProcessor;
import org.ecommerce.services.CreditCardService;

public class CreditCardAdapter implements PaymentProcessor {

    private CreditCardService creditCardService;

    public CreditCardAdapter() {
        this.creditCardService = new CreditCardService();
    }

    @Override
    public void processPayment(double amount) {
        creditCardService.payWithCard(amount);
    }

}
