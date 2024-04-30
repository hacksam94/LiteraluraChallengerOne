package com.aluracursos.LiteraluraChallenger.service;

public interface IDeserializarDatos {
    <T>T obtenerDatos(String json , Class <T> clase) ;
}
//