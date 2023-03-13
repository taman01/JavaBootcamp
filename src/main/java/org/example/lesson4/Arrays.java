package org.example.lesson4;

public class Arrays {

    static boolean isAnagram(char[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - (i+1)]) return false;

        }
        return true;
    }
}
