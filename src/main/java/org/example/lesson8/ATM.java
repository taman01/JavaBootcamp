package org.example.lesson8;

public interface ATM {
    int getBalance ();

    void addBankNote(int sum,String currencyCode );
    BankNote[] getBankNote(int sum);

}
