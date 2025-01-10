package com.example.electricitybill.controller;

public class PaymentResponse {
    private String status;
    private double amountPaid;
    private double billAmount;
    private String message;

    // Constructor
    public PaymentResponse(String status, double amountPaid, double billAmount, String message) {
        this.status = status;
        this.amountPaid = amountPaid;
        this.billAmount = billAmount;
        this.message = message;
    }

    // Getters and setters
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
