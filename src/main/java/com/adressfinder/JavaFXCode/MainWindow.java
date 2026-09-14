package com.adressfinder.JavaFXCode;

import com.adressfinder.ApiResponseSorter.TavilyResponse;
import com.adressfinder.ApiResponseSorter.TavilyResult;
import com.adressfinder.SearchLogistic.SearchLogic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MainWindow extends Application{

    private Button searchButton;
    private TextField inputField;
    private TextField apiKeyField;

    private String apiKey;

    TavilyResponse response = null;
    
    @Override
    public void start(Stage stage) {

        
       
        SearchLogic searchLogic = new SearchLogic();

        setup();

        searchButton.setOnAction(event -> {

            //Einlesen der Labels
            String instruction = inputField.getText();
            apiKey = apiKeyField.getText();

            //Verarbeitung der Eingaben
            response = searchLogic.processInput(instruction, apiKey);
            
            //Output result
            printResult(response);
        });


    

        VBox root = new VBox(searchButton, inputField, apiKeyField);

        Scene scene = new Scene(root, 500, 300);

        stage.setTitle("AdressFinder");
        stage.setScene(scene);
        stage.show();
    }



    
    private void setup() { //Setup der GUI Elemente

        searchButton = new Button("Suchen");

        inputField = new TextField();
        inputField.setPromptText("Input hier");

        apiKeyField = new TextField();
        apiKeyField.setPromptText("API-Key hier");  

    }


    private void printResult(TavilyResponse response) { //Temporäre Methode für Ausgabe der response
        

        System.out.println("Suchanfrage:");
        System.out.println(response.getQuery());

        System.out.println("\nErgebnisse:");
        
        for (TavilyResult result : response.getResults()) {

            System.out.println("Titel: " + result.getTitle());
            System.out.println("URL: " + result.getUrl());
            System.out.println("Content: " + result.getContent());
            System.out.println("Score: " + result.getScore());

            System.out.println("----------------------");


    }

}
}