package com.sabinghost19.openfeign_clientcaller.controller;

import com.sabinghost19.openfeign_clientcaller.model.Payment;
import com.sabinghost19.openfeign_clientcaller.proxy.PaymentProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class PaymentController {

    private final PaymentProxy paymentProxy;
    private final Logger logger = Logger.getLogger(PaymentController.class.getName());
    @Autowired
    public PaymentController(PaymentProxy paymentProxy) {
        this.paymentProxy = paymentProxy;
    }

    @PostMapping("/payment")
    public ResponseEntity<Payment>makePayment(@RequestBody Payment payment){

        logger.info("New Request arrived: " + payment.getAmount());

        String requestId = UUID.randomUUID().toString();
        return this.paymentProxy.payment(requestId,payment);
    }
}
