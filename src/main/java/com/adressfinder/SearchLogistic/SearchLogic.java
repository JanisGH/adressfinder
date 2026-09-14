package com.adressfinder.SearchLogistic;

import com.adressfinder.ApiRequests.TavilyApi;
import com.adressfinder.ApiResponseSorter.TavilyResponse;


public class SearchLogic {

    public TavilyResponse processInput(String instruction, String apiKey) {

        TavilyResponse apiResponse = null;

            if (!(apiKey.startsWith("tvly-dev"))) {
                return null;
            } else {

                TavilyApi tavilyApi = new TavilyApi(apiKey);
                
                try {
                    apiResponse = tavilyApi.search(instruction);
                    
                } catch (Exception e) {
                    // TODO Auto-generated catch block



                    e.printStackTrace();
                }

                return apiResponse;
            }

    }
}
