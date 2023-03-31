package com.example.tpnote;

/**
 * Classe Taux (modèle du MVC) permettant de gérer les taux sur une transaction bancaire
 *
 * @since le 31/03/2023
 * @version le 31/03/2023
 *
 * @author Nicolas Ferrayé - 3iL
 */
public class Taux {

    private String nom;
    private double seuilInferieur;
    private double seuilSuperieur;

    /**
     * Constructeur de Taux
     *
     * @param pfNom le nom du Taux
     * @param pfSeuilInferieur seuil inférieur du Taux
     * @param pfSeuilSuperieur seuil supérieur du Taux
     */
    public Taux(String pfNom, double pfSeuilInferieur, double pfSeuilSuperieur) throws Exception {

        // Teste si le nom du Taux n'est pas vide
        if(pfNom.isEmpty()) {
            throw new Exception("Le nom du Taux ne peut pas être vide");
        }

        this.nom = pfNom;
        this.seuilInferieur = pfSeuilInferieur;
        this.seuilSuperieur = pfSeuilSuperieur;
    }

    public String getNom() {
        return "";
    }

    public double getSeuilInferieur() {
        return 0.0;
    }

    public double getSeuilSuperieur() {
        return 0.0;
    }

    public void setNom(String pfNom) {

    }

    public void setSeuilInferieur(double pfSeuilInferieur) {

    }

    public void setSeuilSuperieur(double pfSeuilSuperieur) {

    }

}
