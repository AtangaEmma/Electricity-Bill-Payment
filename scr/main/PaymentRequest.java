package com.example.electricitybill.controller;

public class PaymentRequest {
    private int units;
    private double amountPaid;

    // Constructor
    public PaymentRequest() {}

    // Getters and setters
    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }
}
