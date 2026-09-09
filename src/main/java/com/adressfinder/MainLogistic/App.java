package com.adressfinder.MainLogistic;

import com.adressfinder.SearchLogistic.SearchService;

public class App {


    public static void main(String[] args) {

        
        SearchService searchService = new SearchService();
        String result = searchService.process();

        System.out.println(result);

    }

}