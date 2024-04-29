package com.aluracursos.LiteraluraChallenger;

import com.aluracursos.LiteraluraChallenger.model.DatosLibros;
import com.aluracursos.LiteraluraChallenger.service.ConsumoApi;
import com.aluracursos.LiteraluraChallenger.service.DeserializarDatos;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.ls.LSOutput;

@SpringBootApplication
public class LiteraluraChallengerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraChallengerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

       var consumoApi = new ConsumoApi() ;
		String url;
		var json = consumoApi.obtenerDatos( "https://gutendex.com/books/" )  ;

		//System.out.println("json = " + json) ;    //ver lo que esta entregando el api en json

		DeserializarDatos  deserializar = new DeserializarDatos() ;
        var datos = deserializar.obtenerDatos( json , DatosLibros.class);
		System.out.println("datos = " + datos);
	}

}
