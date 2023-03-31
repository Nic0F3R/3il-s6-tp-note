package com.example.tpnote;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Modèle de l'application GestionnaireBanque
 *
 * @since le 31/03/2023
 * @version le 31/03/2023
 *
 * @author Nicolas Ferrayé - 3iL
 */
public class GestionnaireBanque extends Application {

    private List<Transaction> al_transactions = new ArrayList<Transaction>();
    private List<Taux> al_taux = new ArrayList<Taux>();

    private double solde;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GestionnaireBanque.class.getResource("IHM.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 200);
        stage.setTitle("Gestion bancaire");
        stage.setScene(scene);
        stage.getIcons().add(new Image("file:Images/logo3iL.png"));
        stage.setResizable(false);
        stage.show();


        // Chargement des Taux à partir du fichier taux.txt
        try {
            this.loadTaux();
        } catch(Exception e) {
            System.err.println("Erreur lors du chargement des Taux");
        }


        // Enregistrement des Transactions effectuées dans le fichier SaveList.bin
        try {
            this.saveTransactions();
        } catch(Exception e) {
            System.err.println("Erreur lors de l'enregistrement des Transactions");
        }


        // Chargement des Transactions enregistrées dans le fichier SaveList.bin
        try {
            this.loadTransactions();
        } catch(Exception e) {
            System.err.println("Erreur lors du chargement des Transactions");
        }


    }

    public static void main(String[] args) {
        launch();
    }

    /**
     * Permet d'initialiser la liste des Taux à partir du fichier taux.txt
     */
    private void loadTaux() {

        try {

            // Déclaration des variables de traitement
            String ligne;
            String[] tabLigne;
            String nomTaux;
            double seuilInferieur;
            double seuilSuperieur;
            Taux taux;

            // Déclaration et initialisation de la variable file et de son Scanner
            File file = new File("Data", "taux.txt");

            Scanner sc = new Scanner(file);

            // Parcours ligne par ligne du fichier taux.txt
            while(sc.hasNextLine()) {

                ligne = sc.nextLine();

                // Séparation des données avec le séparateur " "
                tabLigne = ligne.split(" ");

                nomTaux = tabLigne[0];
                seuilInferieur = Double.parseDouble(tabLigne[1]);
                seuilSuperieur = Double.parseDouble(tabLigne[2]);

                // Initialisation de l'objet taux avec les valeurs de la ligne en cours
                taux = new Taux(nomTaux, seuilInferieur, seuilSuperieur);

                // Ajout de l'objet taux à l'ArrayList al_taux
                this.al_taux.add(taux);

                System.out.println("Nom : " + nomTaux + " ; " + "seuil i : " + seuilInferieur + " ; " + "seuil s : " + seuilSuperieur + "\n");

            }

            sc.close();

        } catch(Exception e) {
            System.err.println("Erreur sur le chargement des Taux dans l'application");
        }

    }

    /**
     * Permet d'enregistrer toutes les transactions dans le fichier binaire SaveList.bin
     */
    private void saveTransactions() {

        try {
            FileOutputStream fos = new FileOutputStream("Data" + System.getProperty("file.separator") + "SaveList.bin");

            for(Transaction transaction : al_transactions) {
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(transaction);
                oos.close();
            }



        } catch(Exception e) {
            System.err.println("Erreur lors de l'enregistrement des Transactions du compte");
        }
    }

    /**
     * Permet de charger toutes les transactions dans l'ArrayList al_transactions
     */
    private void loadTransactions() {

        this.al_transactions = null;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Data" + System.getProperty("file.separator") + "SaveList.bin"))) {

            if(in != null) {
                this.al_transactions = (ArrayList<Transaction>) in.readObject();
            }

        } catch(Exception e) {
            System.err.println("Erreur lors du chargement des Transactions du compte -> " + e.getMessage());
        }

    }
}