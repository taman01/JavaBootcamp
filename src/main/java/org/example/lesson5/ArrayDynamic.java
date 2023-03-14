package org.example.lesson5;

public class ArrayDynamic {

    static int[] array = new int[10];
    static int lastIndex = -1;

    static int get(int index) {
        if (index > lastIndex) {
            System.out.println("Индекс слишком большой");
            return 0;
        }
        return array[index];
    }

    static void add(int number) {
        if (lastIndex >= (array.length - 1)) {
            increaseSize();
        }
        array[lastIndex + 1] = number;
        lastIndex++;

    }

    static void increaseSize() {
        int[] newArray = new int[array.length * 2];
        for (int i=0; i< array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public static void main(String[] args) {
        for (int i=1; i<=100; i++) {
            add(i);
        }
        System.out.println(get(99));
        System.out.println("Текущий размер: " + array.length);
    }
}
