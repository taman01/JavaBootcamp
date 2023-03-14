package org.example.lesson5;

public class ArraySimple {

    static int [] array = new int[10];

    static int get(int index){
        if (index >= array.length){
            System.out.println("Индекс больще размера массива");
            return 0;
        }
        return array[index];

    }
    static void set(int index, int number){
        if (index >= array.length) {
            System.out.println("Индекс больще размера массива");
            return;
        }
        array[index] = number;
    }

    public static void main(String[] args) {
        set(2,10);
        set(5,4);
        set(0,12);
        System.out.println(get(5));
        System.out.println(get(4));
    }
}
