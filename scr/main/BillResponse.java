package com.example.electricitybill.controller;

public class BillResponse {
    private int unitsConsumed;
    private double billAmount;
    private String message;

    // Constructor
    public BillResponse(int unitsConsumed, double billAmount, String message) {
        this.unitsConsumed = unitsConsumed;
        this.billAmount = billAmount;
        this.message = message;
    }

    // Getters and setters
    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
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
