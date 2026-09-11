package com.adressfinder.JavaFXCode;

import com.adressfinder.ApiRequests.TavilyApi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MainWindow extends Application{

    private Button searchButton;
    private TextField inputField;
    private TextField apiKeyField;
    private TextField resultField;

    private String apiKey;
    
    @Override
    public void start(Stage stage) {
       
        setup();


        searchButton.setOnAction(event -> { //Gibt inputs weiter und kriegt output

            String instruction = inputField.getText();
            apiKey = apiKeyField.getText();


            if (!(apiKey.startsWith("tvly-dev"))) {
                resultField.setText("Ungültiger API-Key!");
            } else {
                TavilyApi tavilyApi = new TavilyApi(apiKey);
                String apiResponse = tavilyApi.callApi(instruction);

                resultField.setText(apiResponse);
            }

        });





        VBox root = new VBox(searchButton, inputField, apiKeyField, resultField);

        Scene scene = new Scene(root, 500, 300);

        stage.setTitle("AdressFinder");
        stage.setScene(scene);
        stage.show();
    }


    private void setup() {

        searchButton = new Button("Suchen");

        inputField = new TextField();
        inputField.setPromptText("Input hier");

        apiKeyField = new TextField();
        apiKeyField.setPromptText("API-Key hier");

        resultField = new TextField();
        resultField.setPromptText("Ergebnis hier");

    }

    
    
}