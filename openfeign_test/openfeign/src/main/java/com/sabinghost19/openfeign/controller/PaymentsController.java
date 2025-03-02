package com.sabinghost19.openfeign.controller;

import com.sabinghost19.openfeign.model.PaymentDetails;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class PaymentsController {

    private static final Logger logger = Logger.getLogger(PaymentsController.class.getName());

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> getPaymentDetails(@RequestHeader String requestId,
                                                            @RequestBody PaymentDetails paymentDetails) {
        logger.info("Received request with ID " + requestId +
                " ;Payment Amount: " + paymentDetails.getAmount());
        paymentDetails.setPaymentId(UUID.randomUUID().toString());

        return ResponseEntity.status(HttpStatus.OK).
                header("requestId",paymentDetails.getPaymentId()).body(paymentDetails);
    }



}
