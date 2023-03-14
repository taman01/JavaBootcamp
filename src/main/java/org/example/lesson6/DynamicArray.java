package org.example.lesson6;

import java.util.Arrays;

public class DynamicArray {

    static String[] array = new String[10];
    static int lastIndex = 0;

    static String get(int index) {
        if (index >= 0 && index < lastIndex)
            return array[index];
        return null;
    }



    static boolean set(int index, String value) {
        if (index >= 0 && index < lastIndex) {
            array[index] = value;
            return true;
        }
        return false;


    }


    static void add(String value) {
        insert(lastIndex, value);

    }

    static void increaseSize() {
        array = Arrays.copyOf(array, array.length * 2);
    }


    static void clear() {
        Arrays.fill(array, null);
        lastIndex = 0;
    }

    static int length() {
        return lastIndex;
    }

    static boolean insert(int index, String value) {
        if (index < 0 || index > lastIndex) {
            return false;
        }

        if (lastIndex == array.length) {
            increaseSize();
        }

        for (int i = lastIndex - 1; i >= index; --i) {
            array[i + 1] = array[i];
        }

        array[index] = value;
        lastIndex += 1;

        return true;
    }


    static String remove(int index) {


        if (index < 0 || index >= lastIndex)
            return null;

        var erased = array[index];


        for (int i = index + 1; i < lastIndex; ++i) {
            array[i - 1] = array[i];
        }


        lastIndex -= 1;

        return erased;
    }


    public static void main(String[] args) {
        DynamicArray.add("Hello");
        DynamicArray.add("World");
        DynamicArray.add("World");
        DynamicArray.add("World");
        DynamicArray.add("World");
        DynamicArray.add("World");
        DynamicArray.add("World");
        DynamicArray.add("World");
        DynamicArray.add("World");
        DynamicArray.add("World");
        DynamicArray.add("World");
        System.out.println(DynamicArray.get(0));
        System.out.println(DynamicArray.get(1));
        System.out.println(array.length);
        System.out.println(DynamicArray.set(15, "Hello"));
        System.out.println(Arrays.toString(array));
        DynamicArray.clear();
        System.out.println(Arrays.toString(array));
    }
}



