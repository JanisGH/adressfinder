package com.adressfinder.ApiResponseSorter;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TavilyResponse {

//Ganze Antwort von Tavily
    private String query;
    private List<TavilyResult> results;

    public TavilyResponse() {
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public List<TavilyResult> getResults() {
        return results;
    }

    public void setResults(List<TavilyResult> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "TavilyResponse{" +
                "query='" + query + '\'' +
                ", results=" + results +
                '}';
    }
}
