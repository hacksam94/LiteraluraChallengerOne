package com.aluracursos.LiteraluraChallenger.model;
import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;


@Entity
@Table(name="autor")

public class Author {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    String name;
    @JsonAlias({"birth_year"})
    int birthYear;
    @JsonAlias({"death_year"})
    int deathYear;

    public Author() {
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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