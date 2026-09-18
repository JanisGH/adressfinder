package com.adressfinder.SearchLogistic;

import com.adressfinder.ApiRequests.GeminiApi;
import com.adressfinder.ApiRequests.TavilyApi;
import com.adressfinder.ApiResponseSorter.TavilyResponse;
import com.adressfinder.DatenObjekte.Company;


public class SearchLogic {

    public TavilyResponse TavilyProcessInput(String instruction, String apiKey) {

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


    public Company geminiProcessInput(String apiKey) {

        Company company = null;

        GeminiApi geminiApi = new GeminiApi(apiKey);

        try {
            company = geminiApi.callApi("Antworte nur mit: API funktioniert");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }




        return company;
    }










}
