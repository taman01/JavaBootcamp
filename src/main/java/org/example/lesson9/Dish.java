package org.example.lesson9;

public class Dish {

    private final String nameOfDish;
    private int amountOfDish;

    public Dish(String nameOfDish, int amountOfDish) {
        this.nameOfDish = nameOfDish;
        this.amountOfDish = amountOfDish;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public int getAmountOfDish() {
        return amountOfDish;
    }
}
