package com.adressfinder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.adressfinder.SearchLogistic.SearchLogic;


public class SearchLogicTest {
    
    @Test
    public void invalidApiKeyTest() {
        //Arrange Act Assert
        SearchLogic searchLogic = new SearchLogic();

        String result = searchLogic.processInput("LTA Legal & Tax Assekuranzmakler GmbH", "invalid-API-Key");

        assertEquals("Ungültiger API-Key!", result);
    }

}
