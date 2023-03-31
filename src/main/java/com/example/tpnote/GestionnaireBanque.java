package com.example.tpnote;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Modèle de l'application GestionnaireBanque
 *
 * @since le 31/03/2023
 * @version le 31/03/2023
 *
 * @author Nicolas Ferrayé - 3iL
 */
public class GestionnaireBanque extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GestionnaireBanque.class.getResource("IHM.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 200);
        stage.setTitle("Gestion bancaire");
        stage.setScene(scene);
        stage.getIcons().add(new Image("file:Images/logo3iL.png"));
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}