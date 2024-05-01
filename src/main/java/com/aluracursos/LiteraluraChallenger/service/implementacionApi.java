package com.aluracursos.LiteraluraChallenger.service;

import com.aluracursos.LiteraluraChallenger.model.DatosLibros;

public class implementacionApi {

    public String listarLibros() throws Exception {

        var consumoApi = new ConsumoApi() ;

        var json = consumoApi.obtenerDatos( "https://gutendex.com/books/" )  ;

            DeserializarDatos  deserializar = new DeserializarDatos() ;
        DatosLibros datos = deserializar.obtenerDatos( json , DatosLibros.class);

        for (var book : datos.getResults()) {
            System.out.printf("Libro:  %s%n", book.getTitle());

        }


        return "Fin";
    };

  public static String opcionTwoMenu() throws Exception {
      implementacionApi implement = new implementacionApi();
      var	data = implement.listarLibros();

      System.out.println(data);

      return "####################################################################";
  }


}

