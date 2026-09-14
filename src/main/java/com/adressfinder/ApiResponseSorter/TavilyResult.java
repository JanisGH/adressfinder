package com.adressfinder.ApiResponseSorter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TavilyResult {

//Einzelne Ergebnisse von Tavily
    private String title;
    private String url;
    private String content;
    private double score;

    public TavilyResult() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "TavilyResult{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", content='" + content + '\'' +
                ", score=" + score +
                '}';
    }
}
