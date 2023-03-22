package org.example.lesson9;


import java.util.Arrays;
import java.util.stream.Stream;

public class DiningApp {

    public static void main(String[] args) {

        Visitor[] visitors = new Visitor[]{
                new Visitor("Yaroslav", "Altuhov"),
                new Visitor("Maks", "TrytoLearn"),
                new Visitor("Denis", "Denisov"),
                new Visitor("Inna", "Innova"),
                new Visitor("Evgeniy", "Tomanov")
        };
       // System.out.println(Arrays.toString(visitors[i].getFirstName() + visitors[]));
       // Arrays.stream(visitors).forEach(s -> Arrays.stream(s).forEach(System.out::println));

    }

}
