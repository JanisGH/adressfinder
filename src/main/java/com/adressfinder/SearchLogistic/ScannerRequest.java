package com.adressfinder.SearchLogistic;

import java.util.Scanner;


public class ScannerRequest {
    
//Gerade ungenutzt

    public String scanForInstruction() {

        System.out.println("Bitte gib eine Anweisung ein:");

        Scanner stringScanner = new Scanner(System.in);
        String result = stringScanner.next();





        return result;
    }

    public String scanForAPIKey() {

        System.out.println("Bitte gib deinen API-Key ein:");

        Scanner stringScanner = new Scanner(System.in);
        String result = stringScanner.next();

        if (!(result.startsWith("tvly-dev"))) {
            return "Ungültiger API-Key!";
        }



        return result;
    }

}
