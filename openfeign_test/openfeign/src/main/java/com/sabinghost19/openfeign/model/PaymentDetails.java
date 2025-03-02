package com.sabinghost19.openfeign.model;

public class PaymentDetails
{
    private String paymentId;
    private double amount;

    public PaymentDetails(String paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
