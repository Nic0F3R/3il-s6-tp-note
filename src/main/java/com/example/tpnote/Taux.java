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

        // Teste si le seuil inférieur est négatif
        if(pfSeuilInferieur < 0) {
            throw new Exception("Le seuil inférieur ne peut pas être négatif");
        }

        // Teste si le seuil supérieur est négatif
        if(pfSeuilSuperieur < 0) {
            throw new Exception("Le seuil supérieur ne peut pas être négatif");
        }

        // Teste si le seuil supérieur est inférieur au seuil inférieur
        if(pfSeuilSuperieur < pfSeuilInferieur) {
            throw new Exception("Le seuil supérieur ne peut pas être inférieur au seuil inférieur");
        }

        this.nom = pfNom;
        this.seuilInferieur = pfSeuilInferieur;
        this.seuilSuperieur = pfSeuilSuperieur;
    }

    /**
     * @return le nom du Taux
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * @return le seuil inférieur du Taux
     */
    public double getSeuilInferieur() {
        return this.seuilInferieur;
    }

    /**
     * @return le seuil supérieur du Taux
     */
    public double getSeuilSuperieur() {
        return this.seuilSuperieur;
    }

    /**
     * Modifie le nom du Taux
     *
     * @param pfNom le nom du Taux
     * @throws Exception si le nom est vide
     */
    public void setNom(String pfNom) throws Exception {

        // Teste si le nom du Taux n'est pas vide
        if(pfNom.isEmpty()) {
            throw new Exception("Le nom du Taux ne peut pas être vide");
        }

        this.nom = pfNom;

    }

    /**
     * Modifie le seuil inférieur du Taux
     *
     * @param pfSeuilInferieur le seuil inférieur du taux
     * @throws Exception si le seuil inférieur est < 0 ou > au seuil supérieur
     */
    public void setSeuilInferieur(double pfSeuilInferieur) throws Exception {

        // Teste si le seuil inférieur est négatif
        if(pfSeuilInferieur < 0) {
            throw new Exception("Le seuil inférieur ne peut pas être négatif");
        }

        // Teste si le seuil supérieur est inférieur au seuil inférieur
        if(this.seuilSuperieur < pfSeuilInferieur) {
            throw new Exception("Le seuil supérieur ne peut pas être inférieur au seuil inférieur");
        }

        this.seuilInferieur = pfSeuilInferieur;

    }

    /**
     * Modifie le seuil supérieur du Taux
     *
     * @param pfSeuilSuperieur le seuil supérieur du taux
     * @throws Exception si le seuil supérieur est < 0 ou < au seuil inférieur
     */
    public void setSeuilSuperieur(double pfSeuilSuperieur) throws Exception {

        // Teste si le seuil supérieur est négatif
        if(pfSeuilSuperieur < 0) {
            throw new Exception("Le seuil supérieur ne peut pas être négatif");
        }

        // Teste si le seuil supérieur est inférieur au seuil inférieur
        if(pfSeuilSuperieur < this.seuilInferieur) {
            throw new Exception("Le seuil supérieur ne peut pas être inférieur au seuil inférieur");
        }

        this.seuilSuperieur = pfSeuilSuperieur;

    }

}
