package com.aluracursos.LiteraluraChallenger.model;
import com.fasterxml.jackson.annotation.JsonAlias;
public class Author {
    String name;
    @JsonAlias({"birth_year"})
    int birthYear;
    @JsonAlias({"death_year"})
    int deathYear;

    public Author() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getDeathYear() {
        return this.deathYear;
    }

    public void setDeathYear(int deathYear) {
        this.deathYear = deathYear;
    }
}