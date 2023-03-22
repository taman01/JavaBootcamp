package org.example.lesson8;

public enum Nominal {
    ten(10), fifty(50), hundred(100), thousand(1000);
    private int amount;

    public int getAmount() {
        return amount;
    }

    Nominal(int amount) {
        this.amount = amount;
    }
}
