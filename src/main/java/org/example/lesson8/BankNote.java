package org.example.lesson8;

public class BankNote {
    private int denomination;
    private Currency currency;

    public BankNote(int denomination, Currency currency) {
        this.denomination = denomination;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "BankNote{" +
                "denomination=" + denomination +
                ", count=" + count +
                '}';
    }

    private int count;

    public int getCount() {
        return count;
    }

    public int getDenomination() {
        return denomination;
    }

    public BankNote(int denomination, int count) {
        this.denomination = denomination;
        this.count = count;
    }

    public void incrementCount(int countDif) {
        count += countDif;
    }

}
