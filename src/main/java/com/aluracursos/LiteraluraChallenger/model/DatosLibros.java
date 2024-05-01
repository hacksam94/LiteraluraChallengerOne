package com.aluracursos.LiteraluraChallenger.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)

public class DatosLibros {
    int count;
    ArrayList<Book> results;

    public ArrayList<Book> getResults() {
        return results;
    }

    public void setResults(ArrayList<Book> results) {
        this.results = results;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}