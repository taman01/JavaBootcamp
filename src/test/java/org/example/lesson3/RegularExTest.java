package org.example.lesson3;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class RegularExTest {


    @Test
    void processLineError(){
       assertThrows(Exception.class, () -> RegularEx.processLinePlus("x"));
   }

    @Test
    void processLinePlus(){
        assertEquals(5,RegularEx.processLinePlus("2+3"));
    }
}

