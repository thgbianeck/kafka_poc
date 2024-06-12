package br.com.bianeck.paymentservice.service;

import br.com.bianeck.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
