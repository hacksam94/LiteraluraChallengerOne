package com.aluracursos.LiteraluraChallenger;
import com.aluracursos.LiteraluraChallenger.service.ImplementacionApi;
import com.aluracursos.LiteraluraChallenger.vista.Menu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraChallengerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraChallengerApplication.class, args);
	}

	@Override
	public  void run(String... args) throws Exception {


		boolean salir = false;
		while (!salir) {
			Menu.mostrarMenu();
			int opcion = Menu.obtenerOpcion();
			Menu.procesarOpcion(opcion);
			if (opcion == 0) {
				salir = true;
			}
		}


//
			ImplementacionApi implement = new ImplementacionApi();
		    var	data = implement.listBooks();

     		System.out.println(data);













	}

}
