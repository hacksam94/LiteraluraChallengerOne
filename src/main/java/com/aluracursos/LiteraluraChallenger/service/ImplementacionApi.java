package com.aluracursos.LiteraluraChallenger.service;

import com.aluracursos.LiteraluraChallenger.model.Author;
import com.aluracursos.LiteraluraChallenger.model.Book;
import com.aluracursos.LiteraluraChallenger.model.DatosLibros;
import com.aluracursos.LiteraluraChallenger.vista.Menu;
public class ImplementacionApi {

    public static String listBooks() throws Exception {

        var consumoApi = new ConsumoApi() ;

        var json = consumoApi.obtenerDatos( "https://gutendex.com/books/" )  ;

            DeserializarDatos  deserializar = new DeserializarDatos() ;
        DatosLibros datos = deserializar.obtenerDatos( json , DatosLibros.class);

        for (var book : datos.getResults()) {
            System.out.printf("Libro:  %s%n", book.getTitle());

        }


        return "Fin";
    };


    public static String searchBookForTitle() throws Exception {
        String textoUsuario =Menu.libroBuscado ;

        textoUsuario = textoUsuario.trim();

       String texto = textoUsuario.replace(" ", "%20");

        var consumoApi = new ConsumoApi() ;

        var json = consumoApi.obtenerDatos( "https://gutendex.com/books//?search=" + texto  )  ;



        
        DeserializarDatos  deserializar = new DeserializarDatos() ;
       DatosLibros datos = deserializar.obtenerDatos( json , DatosLibros.class);

        for (var book : datos.getResults()) {

            System.out.printf("Libro:  %s%n", book.getTitle());
            System.out.println("Autor: " + datos.getResults().get(0).getAuthors().get(0).getName());

       }


        return "Fin";
    }

}

