package org.example.lesson8;

public class ATMInput implements ATM {
    public static final int ATM_SIZE = 8;
    Slot[] slots = new Slot[ATM_SIZE];

    public ATMInput() {
        slots[0] = new Slot(Currency.rub, Nominal.ten);
        slots[1] = new Slot(Currency.rub, Nominal.fifty);
        slots[2] = new Slot(Currency.rub, Nominal.hundred);
        slots[3] = new Slot(Currency.rub, Nominal.thousand);
        slots[4] = new Slot(Currency.usd, Nominal.ten);
        slots[5] = new Slot(Currency.usd, Nominal.fifty);
        slots[6] = new Slot(Currency.usd, Nominal.hundred);
        slots[7] = new Slot(Currency.usd, Nominal.thousand);

    }

    @Override
    public String toString() {
        return "ATM{" +
                "totalAmount=" +
                '}';
    }

    @Override
    public int getBalance() {
        int result = 0;
        for (int i = 0; i < slots.length; i++) {
            result += slots[i].getAmount();
        }
        return result;
    }

    @Override
    public BankNote[] getBankNote(int sum) {
        return new BankNote[0];
    }

    public void addBankNote(int sum, String currencyCode) {

        Currency correntsy = Currency.valueOf(currencyCode);
        BankNote bankNote = new BankNote(sum, correntsy);
        for (int i = 0; i < slots.length; i++) {
            if (slots[i].getCorrentsy() == correntsy && slots[i].getNominal().getAmount() == sum) {
                slots[i].add(bankNote);
                break;
            }
        }
    }
}
