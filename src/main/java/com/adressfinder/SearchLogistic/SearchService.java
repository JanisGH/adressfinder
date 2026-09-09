package com.adressfinder.SearchLogistic;

import com.adressfinder.ApiRequests.TavilyApi;



public class SearchService {

//Wahrscheinlich nachher mit JavaFX redundant

    public String process() {

        ScannerRequest scannerRequest = new ScannerRequest();
        String instruction = scannerRequest.scanForInstruction();


        String apiKey = scannerRequest.scanForAPIKey();

        TavilyApi tavilyApi = new TavilyApi(apiKey);
        String apiResponse = tavilyApi.callApi(instruction);


        return apiResponse;
    }

    
}
