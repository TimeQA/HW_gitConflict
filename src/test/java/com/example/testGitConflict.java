package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testGitConflict {

    @Test
    void firstTest() {
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void  secongTest() {
        Assertions.assertTrue(3 > 0);
    }

    @Test
    void thirdTest() {
        Assertions.assertTrue(99 > 12);
    }
}
