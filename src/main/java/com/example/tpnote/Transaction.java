package com.example.tpnote;

import java.io.Serializable;

/**
 * Classe Transaction (modèle du MVC) permettant de gérer une transaction bancaire
 *
 * @since le 31/03/2023
 * @version le 31/03/2023
 *
 * @author Nicolas Ferrayé - 3iL
 */
public class Transaction implements Serializable {

    private String nom;
    private char type;
    private double montant;

    /**
     * Constructeur de Transaction
     *
     * @param pfNom le nom de la transaction
     * @param pfType le type de la transaction ('c' pour crédit, 'd' pour débit)
     * @param pfMontant le montant de la transaction
     */
    public Transaction(String pfNom, char pfType, double pfMontant) {

    }

    public String getNom() {
        return "str";
    }

    public char getType() {
        return 'c';
    }

    public double getMontant() {
        return 0.0;
    }

    public void setNom() {

    }

    public void setType() {

    }

    public void setMontant() {

    }
}
