package com.adressfinder.MainLogistic;

import com.adressfinder.ApiRequests.GeminiApi;
import com.adressfinder.JavaFXCode.MainWindow;

import javafx.application.Application;

public class App {


    public static void main(String[] args) {

        // String apiKey = "INPUT_YOUR_API_KEY_HERE"; // Replace with your actual API key

        // GeminiApi geminiApi = new GeminiApi(apiKey);

        // String result = "nichts passiert";

        // try {
        //     result = geminiApi.callApi(
        //         "Antworte nur mit: API funktioniert"
        //     );
        // } catch (Exception e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        // System.out.println(result);
        


        Application.launch(MainWindow.class, args);
        
    }

}
