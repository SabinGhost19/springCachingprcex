package com.sabinghost19.openfeign_clientcaller.model;

public class Payment
{
    private String requestId;
    private double amount;

    public Payment(String requestId, double amount) {
        this.requestId = requestId;
        this.amount = amount;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
