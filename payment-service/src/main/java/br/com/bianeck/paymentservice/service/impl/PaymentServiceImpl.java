package br.com.bianeck.paymentservice.service.impl;

import br.com.bianeck.paymentservice.model.Payment;
import br.com.bianeck.paymentservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void sendPayment(Payment payment) {
       log.info("PAYMENT_SERVICE_IMPL ::: Recebi o pagamento: {}", payment);
    }
}
