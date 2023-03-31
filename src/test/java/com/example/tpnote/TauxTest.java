package com.example.tpnote;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TauxTest {

    // ---- TESTS CONSTRUCTEUR ---- //
    @Test
    void testConstructeur1() {
        try {
            Taux t1 = new Taux("Nom", 0, 1000);
            Taux t2 = new Taux("Nom", 1000, 2000);
        } catch(Exception e) {
            System.err.println("Erreur testConstructeur1() de TauxTest");
        }
    }

    @Test
    void testConstructeur2() {
        assertThrows(Exception.class, () -> {
            Taux t1 = new Taux("", 0, 1000);
        });
    }

    @Test
    void testConstructeur3() {
        assertThrows(Exception.class, () -> {
            Taux t1 = new Taux("Nom", -10, 1000);
            Taux t2 = new Taux("Nom", 0, -10);
        });
    }
}