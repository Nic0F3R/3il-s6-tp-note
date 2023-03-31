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

    @Test
    void testConstructeur4() {
        assertThrows(Exception.class, () -> {
            Taux t1 = new Taux("Nom", 500, 200);
        });
    }

    // ---- TESTS GETTERS ---- //

    @Test
    void testGetNom() {
        try {
            Taux t1 = new Taux("Nom", 0, 1000);
            assertEquals("Nom", t1.getNom());
        } catch(Exception e) {
            System.err.println("Erreur testGetNom() de TauxTest");
        }
    }

    @Test
    void testGetSeuilInferieur() {
        try {
            Taux t1 = new Taux("Nom", 0, 1000);
            assertEquals(0, t1.getSeuilInferieur());
        } catch(Exception e) {
            System.err.println("Erreur testGetSeuilInferieur() de TauxTest");
        }
    }

    @Test
    void testGetSeuilSuperieur() {
        try {
            Taux t1 = new Taux("Nom", 0, 1000);
            assertEquals(1000, t1.getSeuilSuperieur());
        } catch(Exception e) {
            System.err.println("Erreur testGetSeuilSuperieur() de TauxTest");
        }
    }

    // ---- TESTS SETTERS ---- //

    @Test
    void testSetNom1() {
        try {
            Taux t1 = new Taux("Nom", 0, 1000);
            t1.setNom("Nom1");
            assertEquals("Nom1", t1.getNom());
        } catch(Exception e) {
            System.err.println("Erreur testSetNom1() de TauxTest");
        }
    }

    @Test
    void testSetNom2() {
        assertThrows(Exception.class, () -> {
            Taux t1 = new Taux("Nom", 0, 1000);
            t1.setNom("");
        });
    }

    @Test
    void testSetSeuilInferieur1() {
        assertThrows(Exception.class, () -> {
            Taux t1 = new Taux("Nom", 0, 1000);
            t1.setSeuilInferieur(-10);
        });
    }

    @Test
    void testSetSeuilSuperieur1() {
        assertThrows(Exception.class, () -> {
            Taux t1 = new Taux("Nom", 0, 1000);
            t1.setSeuilSuperieur(-10);
        });
    }
}