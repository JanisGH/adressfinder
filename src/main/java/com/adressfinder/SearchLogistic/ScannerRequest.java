package com.adressfinder.SearchLogistic;

import java.util.Scanner;


public class ScannerRequest {
    


    public String scanForInstruction() {

        System.out.println("Bitte gib eine Anweisung ein:");

        Scanner stringScanner = new Scanner(System.in);
        String result = stringScanner.next();


        stringScanner.close();



        return result;
    }




}
