package com.example.tpnote;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    void testConstructeur1() {
        Transaction t1 = new Transaction("Nom", 'c', 2000);
    }

    @Test
    void testGetNom() {
        Transaction t1 = new Transaction("Nom", 'c', 2000);
        assertEquals("Nom", t1.getNom());
    }

    @Test
    void testGetType() {
        Transaction t1 = new Transaction("Nom", 'c', 2000);
        assertEquals('c', t1.getType());
    }

    @Test
    void testGetMontant() {
        Transaction t1 = new Transaction("Nom", 'c', 2000);
        assertEquals(2000.0, t1.getMontant());
    }

    @Test
    void testSetNom() {
        Transaction t1 = new Transaction("Nom", 'c', 2000);
        t1.setNom("Nom1");
        assertEquals("Nom1", t1.getNom());
    }

    @Test
    void testSetType() {
        Transaction t1 = new Transaction("Nom", 'c', 2000);
        t1.setType('d');
        assertEquals('d', t1.getType());
    }






}