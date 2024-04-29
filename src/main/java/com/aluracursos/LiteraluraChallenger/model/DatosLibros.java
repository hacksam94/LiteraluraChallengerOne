package com.aluracursos.LiteraluraChallenger.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)

public record DatosLibros(
        @JsonAlias("count") String contador ,
        @JsonAlias("results") ArrayList resultado

){}


