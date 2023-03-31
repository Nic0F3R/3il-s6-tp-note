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
    public Transaction(String pfNom, char pfType, double pfMontant) throws Exception {

        // Teste si le nom de la transaction n'est pas vide
        if(pfNom.isEmpty()) {
            throw new Exception("Le nom de la transaction ne peut pas être vide");
        }

        // Teste si le type de la transaction est 'c' ou 'd'
        if(!(pfType == 'c' || pfType == 'd')) {
            throw new Exception("Le type de la transaction doit être 'c' ou 'd'");
        }

        // Teste si le débit ou le crédit est négatif ou nul
        if(pfMontant <= 0) {
            throw new Exception("Le montant de la transaction doit être positif");
        }

        this.nom = pfNom;
        this.type = pfType;
        this.montant = pfMontant;
    }

    public String getNom() {
        return this.nom;
    }

    public char getType() {
        return this.type;
    }

    public double getMontant() {
        return this.montant;
    }

    public void setNom(String pfNom) throws Exception {

        // Teste si le nom de la transaction n'est pas vide
        if(pfNom.isEmpty()) {
            throw new Exception("Le nom de la transaction ne peut pas être vide");
        }

        this.nom = pfNom;
    }

    public void setType(char pfType) throws Exception {

        // Teste si le type de la transaction est 'c' ou 'd'
        if(!(pfType == 'c' || pfType == 'd')) {
            throw new Exception("Le type de la transaction doit être 'c' ou 'd'");
        }

        this.type = pfType;
    }

    public void setMontant(double pfMontant) throws Exception {

        // Teste si le débit ou le crédit est négatif ou nul
        if(pfMontant <= 0) {
            throw new Exception("Le montant de la transaction doit être positif");
        }

        this.montant = pfMontant;
    }
}
