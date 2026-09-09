package com.adressfinder.SearchLogistic;

import com.adressfinder.ApiRequests.TavilyApi;



public class SearchService {

//Wahrscheinlich nachher mit JavaFX redundant

    public String process() {

        ScannerRequest scannerRequest = new ScannerRequest();
        String instruction = scannerRequest.scanForInstruction();


        TavilyApi tavilyApi = new TavilyApi("your_api_key_here");
        String apiResponse = tavilyApi.callApi(instruction);


        return apiResponse;
    }

    
}
