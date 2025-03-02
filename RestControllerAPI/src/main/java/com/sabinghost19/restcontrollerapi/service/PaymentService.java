package com.sabinghost19.restcontrollerapi.service;

import com.sabinghost19.restcontrollerapi.exceptions.NotEnoughtMoneyException;
import com.sabinghost19.restcontrollerapi.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment(PaymentDetails paymentDetails) {
        if(paymentDetails.getAmount()<=0){
            throw new NotEnoughtMoneyException();
        }
        return paymentDetails;
    }
}
