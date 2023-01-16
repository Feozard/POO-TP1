package com.POO.TP1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {
    private static Zoo z;
    @BeforeAll
    public static void init() {
        z = new Zoo(1);
    }

    @Test
    void nouveauVisiteurTest() {
        Exception exception = assertThrows(LimiteVisiteurException.class, () -> {
            z.nouveauVisiteur();
            z.nouveauVisiteur();
        });
    }
}