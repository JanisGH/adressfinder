package com.adressfinder.ApiRequests;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.adressfinder.ApiResponseSorter.TavilyResponse;
import com.adressfinder.DatenObjekte.Company;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GeminiApi {

    private final String apiKey;

    public GeminiApi(String apiKey) {
        this.apiKey = apiKey;
    }

    public Company callApi(String prompt) throws Exception {

        HttpClient client = HttpClient.newHttpClient();

        String jsonBody = """
        {
            "contents": [
                {
                    "parts": [
                        {
                            "text": "%s"
                        }
                    ]
                }
            ]
        }
        """.formatted(prompt);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(
                        "https://generativelanguage.googleapis.com/v1beta/models/gemini-3.1-flash-lite:generateContent"
                ))
                .header("x-goog-api-key", apiKey)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();

        HttpResponse<String> response =
                client.send(
                        request,
                        HttpResponse.BodyHandlers.ofString()
                );

        ObjectMapper objectMapper = new ObjectMapper();
        
        Company company = 
                objectMapper.readValue(
                    response.body(),
                    Company.class
                );

        return company;
    }

}