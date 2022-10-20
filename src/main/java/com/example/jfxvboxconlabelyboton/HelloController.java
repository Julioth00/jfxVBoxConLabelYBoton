package com.example.jfxvboxconlabelyboton;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    // Referencia a Nodo InputText
    private TextField textoEntrada;

    // Referencia a Nodo OutputText
    @FXML
    private TextArea textoSalida;


    @FXML
    private void initialize()
    {
    }

    //Método para asignar un texto recibido al campo de texto
    @FXML
    protected void imprimirTexto()
    {
        String texto = textoEntrada.getText();
        textoSalida.setText(texto);
    }
}