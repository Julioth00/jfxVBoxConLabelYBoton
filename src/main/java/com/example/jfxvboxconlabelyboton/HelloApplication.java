package com.example.jfxvboxconlabelyboton;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Crear FXMLLoader y referenciar al archivo .fxml
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        // Crear el Scene
        Scene scene = new Scene(fxmlLoader.load());
        // Aplicar el Scene al Stage
        stage.setScene(scene);
        // Dar titulo al Stage (A LA VENTANA)
        stage.setTitle("A SceneBuilder Example");
        // Reproducir el Stage
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}