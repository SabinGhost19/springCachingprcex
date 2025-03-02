package com.sabinghost19.restcontrollerapi.controller;

import com.sabinghost19.restcontrollerapi.model.PaymentDetails;
import com.sabinghost19.restcontrollerapi.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PaymentController {
    private  PaymentService paymentService;
    private final Logger logger = Logger.getLogger(PaymentController.class.getName());

    @Autowired
    PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> payment(@RequestBody PaymentDetails paymentDetails){
        PaymentDetails new_paymentDetails =paymentService.processPayment(paymentDetails);
        logger.info("New payment details is created "+ new_paymentDetails.getAmount());
        return  ResponseEntity.status(200).body(new_paymentDetails);
    }

}
