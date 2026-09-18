package com.adressfinder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.adressfinder.ApiResponseSorter.TavilyResponse;
import com.adressfinder.SearchLogistic.SearchLogic;


public class SearchLogicTest {
    
    @Test
    public void invalidApiKeyTest() {
        //Arrange Act Assert
        SearchLogic searchLogic = new SearchLogic();

        TavilyResponse result = searchLogic.TavilyProcessInput("LTA Legal & Tax Assekuranzmakler GmbH", "invalid-API-Key");

        assertEquals(null, result);
    }

}
