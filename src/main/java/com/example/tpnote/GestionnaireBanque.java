package com.example.tpnote;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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

    private List<Transaction> al_transactions;
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

        try {
            loadTaux();
        } catch(Exception e) {
            System.err.println("Erreur lors du chargement des Taux");
        }
    }

    public static void main(String[] args) {
        launch();
    }

    /**
     * Permet d'initialiser la liste des Taux à partir du fichier taux.txt
     */
    private void loadTaux() throws Exception {

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




        } catch(Exception e) {
            System.err.println("Erreur sur le chargement des Taux dans l'application");
        }
    }
}