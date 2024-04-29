package com.aluracursos.LiteraluraChallenger.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record DatosLibros(
        @JsonAlias("title") String title,
        @JsonAlias("authors") List<Autor> authors
) {}

