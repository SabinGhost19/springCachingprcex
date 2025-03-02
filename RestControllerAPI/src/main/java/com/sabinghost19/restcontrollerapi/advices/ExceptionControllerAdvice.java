package com.sabinghost19.restcontrollerapi.advices;

import com.sabinghost19.restcontrollerapi.exceptions.NotEnoughtMoneyException;
import com.sabinghost19.restcontrollerapi.model.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughtMoneyException.class)
    public ResponseEntity<ErrorDetails> notEnoughtMoneyHandler(){
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Not enough money");
        return ResponseEntity.badRequest().body(errorDetails);
    }
}
