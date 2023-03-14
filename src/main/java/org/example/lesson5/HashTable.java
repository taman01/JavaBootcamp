package org.example.lesson5;

public class HashTable {

    static String[][] data = new String[23][10];
    static String[][] dataKeys = new String[23][10];
    static int[] lastIndexes = new int[23];

    static void put(String key, String value) {
        int hashCode = hashCode(key);
        int index = hashCode % 23;
        data[index][lastIndexes[index]] = value;
        dataKeys[index][lastIndexes[index]] = key;
        lastIndexes[index]++;
    }

    static String get(String key) {
        int hashCode = hashCode(key);
        int index = hashCode % 23;
        for (int i=0; i<10; i++) {
            if (dataKeys[index][i] == key) {
                return data[index][i];
            }
        }
        System.out.println("Данные не найдены");
        return "";
    }

    static int hashCode(String string) {
        return string.length();
    }

    public static void main(String[] args) {
        put("Февраль", "Снежно");
        put("Март", "Солнечно");
        put("Июнь", "Жарко");
        put("Июль", "Очень жарко");
        System.out.println(get("Июнь"));
        System.out.println(get("Июль"));
    }
}


