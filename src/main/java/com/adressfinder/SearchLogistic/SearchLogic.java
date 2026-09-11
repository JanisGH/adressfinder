package com.adressfinder.SearchLogistic;

import com.adressfinder.ApiRequests.TavilyApi;


public class SearchLogic {

    public String processInput(String instruction, String apiKey) {


            if (!(apiKey.startsWith("tvly-dev"))) {
                return "Ungültiger API-Key!";
            } else {
                TavilyApi tavilyApi = new TavilyApi(apiKey);
                String apiResponse = tavilyApi.callApi(instruction);

                return apiResponse;
            }

    }




}
