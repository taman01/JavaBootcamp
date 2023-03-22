package org.example.lesson8;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATMInput();
        atm.addBankNote(10, "rub");
        atm.addBankNote(50, "rub");
        atm.addBankNote(100, "usd");

        System.out.println(atm.getBalance());
    }
}