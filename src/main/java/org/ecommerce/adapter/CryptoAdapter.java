package org.ecommerce.adapter;

import org.ecommerce.processor.PaymentProcessor;
import org.ecommerce.services.CryptoService;

public class CryptoAdapter implements PaymentProcessor {

    private CryptoService cryptoService;

    public CryptoAdapter() {
        this.cryptoService = new CryptoService();
    }

    @Override
    public void processPayment(double amount) {
        cryptoService.sendCrypto(amount);
    }

}
