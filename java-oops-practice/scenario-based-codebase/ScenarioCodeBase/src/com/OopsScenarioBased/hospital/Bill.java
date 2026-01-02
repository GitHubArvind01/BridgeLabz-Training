package com.OopsScenarioBased.hospital;

class Bill implements Payable {

    private Patient patient;
    private double totalAmount;
    private double pendingAmount;

    private static final double TAX = 0.05;
    private static final double DISCOUNT = 0.10;

    public Bill(Patient patient, double baseAmount) {
        this.patient = patient;

        // calculate once
        this.totalAmount = calculateFinalAmount(baseAmount);
        this.pendingAmount = totalAmount;
    }

    private double calculateFinalAmount(double amount) {
        double taxAmount = amount * TAX;
        double discountAmount = amount * DISCOUNT;
        return amount + taxAmount - discountAmount;
    }

    @Override
    public double calculatePayment() {
        return pendingAmount;
    }

    public void pay(double amount) {
        if (amount > pendingAmount) {
            System.out.println("Payment exceeds pending amount!");
        } else {
            pendingAmount -= amount;
            System.out.println("Payment successful!");
        }
    }

    public void showBill() {
        patient.displayInfo();
        System.out.println("Total Bill Amount: ₹" + totalAmount);
        System.out.println("Pending Amount: ₹" + pendingAmount);
    }

    public boolean isPaid() {
        return pendingAmount == 0;
    }
}