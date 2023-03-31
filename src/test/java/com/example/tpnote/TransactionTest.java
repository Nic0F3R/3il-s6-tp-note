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


}