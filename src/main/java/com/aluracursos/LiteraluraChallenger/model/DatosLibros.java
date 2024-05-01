package com.aluracursos.LiteraluraChallenger.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)

public class DatosLibros {
    int count;
    ArrayList<book> results;

    public  DatosLibros() {
    }

    public ArrayList<book> getResults() {
        return this.results;
    }

    public void setResults(ArrayList<book> results) {
        this.results = results;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}


