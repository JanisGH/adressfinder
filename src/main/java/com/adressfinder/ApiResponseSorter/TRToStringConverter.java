package com.adressfinder.ApiResponseSorter;

public class TRToStringConverter {
    


    //Convertet TavilyResponse to String for easier handling in the rest of the code
    //Gerade ungenutzt
    public String TRToString(TavilyResponse response) {


        StringBuilder builder = new StringBuilder();

        for (TavilyResult result : response.getResults()) {

            builder.append(result.getTitle())
                .append("\n")
                .append(result.getUrl())
                .append("\n\n");
            }

        return builder.toString();
    }











}
