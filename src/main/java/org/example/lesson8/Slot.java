package org.example.lesson8;

public class Slot {
    public static final int COUNT_SIZE = 8;
    private final BankNote[] bankNotes = new BankNote[COUNT_SIZE];
    private final Currency correntsy;
    private int currentSize;

    public Currency getCorrentsy() {
        return correntsy;
    }

    public int getAmount() {
        return currentSize * nominal.getAmount();
    }

    public Nominal getNominal() {
        return nominal;
    }

    private final Nominal nominal;

    public Slot(Currency correntsy, Nominal nominal) {
        this.correntsy = correntsy;
        this.nominal = nominal;
    }

    public void add(BankNote bankNote) {
        bankNotes[currentSize] = bankNote;
        currentSize++;
    }
}
