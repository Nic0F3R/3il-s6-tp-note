package com.example.tpnote;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    // ---- TESTS CONSTRUCTEUR ---- //
    @Test
    void testConstructeur1() {
        try {
            Transaction t1 = new Transaction("Nom", 'c', 2000);
            Transaction t2 = new Transaction("Nom", 'd', 1000);
        } catch(Exception e) {
            System.err.println("Erreur testConstructeur1() de TransactionTest");
        }
    }

    @Test
    void testConstructeur2() {
        assertThrows(Exception.class, () -> {
            Transaction t1 = new Transaction("", 'c', 2000);
        });
    }

    @Test
    void testConstructeur3() {
        assertThrows(Exception.class, () -> {
            Transaction t1 = new Transaction("Nom", 'a', 2000);
        });
    }

    @Test
    void testConstructeur4() {
        assertThrows(Exception.class, () -> {
            Transaction t1 = new Transaction("Nom", 'c', 0);
            Transaction t2 = new Transaction("Nom", 'd', -10);
        });
    }

    // ---- TESTS GETTERS ---- //

    @Test
    void testGetNom() {
        try {
            Transaction t1 = new Transaction("Nom", 'c', 2000);
            assertEquals("Nom", t1.getNom());
        } catch(Exception e) {
            System.err.println("Erreur testGetNom() de TransactionTest");
        }
    }

    @Test
    void testGetType() {
        try {
            Transaction t1 = new Transaction("Nom", 'c', 2000);
            assertEquals('c', t1.getType());
        } catch(Exception e) {
            System.err.println("Erreur testGetType() de TransactionTest");
        }
    }

    @Test
    void testGetMontant() {
        try {
            Transaction t1 = new Transaction("Nom", 'c', 2000);
            assertEquals(2000.0, t1.getMontant());
        } catch(Exception e) {
            System.err.println("Erreur testGetMontant() de TransactionTest");
        }
    }

    // ---- TESTS SETTERS ---- //

    @Test
    void testSetNom1() {
        try {
            Transaction t1 = new Transaction("Nom", 'c', 2000);
            t1.setNom("Nom1");
            assertEquals("Nom1", t1.getNom());
        } catch(Exception e) {
            System.err.println("Erreur testSetNom1() de TransactionTest");
        }
    }

    @Test
    void testSetNom2() {
        assertThrows(Exception.class, () -> {
            Transaction t1 = new Transaction("Nom", 'c', 2000);
            t1.setNom("");
        });
    }

    @Test
    void testSetType1() {
        try {
            Transaction t1 = new Transaction("Nom", 'c', 2000);
            t1.setType('d');
            assertEquals('d', t1.getType());
        } catch(Exception e) {
            System.err.println("Erreur testSetType1() de TransactionTest");
        }
    }

    @Test
    void testSetType2() {
        assertThrows(Exception.class, () -> {
            Transaction t1 = new Transaction("Nom", 'c', 2000);
            t1.setType('a');
        });
    }

    @Test
    void testSetMontant1() {
        try {
            Transaction t1 = new Transaction("Nom", 'c', 2000);
            t1.setMontant(2500.20);
            assertEquals(2500.20, t1.getMontant());
        } catch(Exception e) {
            System.err.println("Erreur testSetMontant1() de TransactionTest");
        }
    }






}