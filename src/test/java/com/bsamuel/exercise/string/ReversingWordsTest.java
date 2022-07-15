package com.bsamuel.exercise.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversingWordsTest {

    ReversingWords rw = new ReversingWords();

    @Test
    void testReversingWords() {
        ReversingWords rw = new ReversingWords();
        String str = rw.reverseString("Hello World").trim();
        assertEquals("olleH dlroW", str);

    }


}