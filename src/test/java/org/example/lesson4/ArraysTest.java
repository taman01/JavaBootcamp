package org.example.lesson4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {

    @Test
    void isAnagram() {

        assertTrue(Arrays.isAnagram("ANNA".toCharArray()),"ANNA is anagram");
        assertTrue(Arrays.isAnagram("ANA".toCharArray()),"ANA is anagram");
        assertTrue(Arrays.isAnagram("".toCharArray()),"'' is anagram");
        assertFalse(Arrays.isAnagram("PAVEL".toCharArray()),"PAVEL is not anagram");
        assertFalse(Arrays.isAnagram("PAVE".toCharArray()),"PAVE is not anagram");
    }
}