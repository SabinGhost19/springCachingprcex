package com.sabinghost19.restcontrollerapi.model;

public class PaymentDetails {
    private double amount;

    public PaymentDetails(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
