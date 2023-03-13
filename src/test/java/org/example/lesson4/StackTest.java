package org.example.lesson4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void test() {
        assertNull(Stack.pop());

        Stack.push(5);
        assertEquals(5, Stack.pop());

        Stack.push(42);
        Stack.push(3);
        assertEquals(3, Stack.pop());
        assertEquals(42, Stack.pop());
        assertNull(Stack.pop());

        Stack.push(42);
        Stack.push(3);
        assertEquals(3, Stack.pop());
        Stack.push(27);
        assertEquals(27, Stack.pop());
        assertEquals(42, Stack.pop());
        assertNull(Stack.pop());
    }
}
