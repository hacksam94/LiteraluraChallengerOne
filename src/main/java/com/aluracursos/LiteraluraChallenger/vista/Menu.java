package com.aluracursos.LiteraluraChallenger.vista;
import com.aluracursos.LiteraluraChallenger.model.Book;
import com.aluracursos.LiteraluraChallenger.model.DatosLibros;
import com.aluracursos.LiteraluraChallenger.service.ConsumoApi;
import com.aluracursos.LiteraluraChallenger.service.DeserializarDatos;
import com.aluracursos.LiteraluraChallenger.service.implementacionApi;

import java.util.Scanner;



public class Menu {



    public static void mostrarMenu() {
        System.out.println("1. Buscar libro por titulo\n");
        System.out.println("2. listar libros registrados \n");
        System.out.println("3. listar autores registrados\n");
        System.out.println("4. listar autores vivos en un determinado año \n");
        System.out.println("5. listar libros por idioma \n");
        System.out.println("0. Salir");
        System.out.println("Selecione una opcion ");
    }

    public static int obtenerOpcion() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt() ;
    }


    public static void procesarOpcion(int opcion) throws Exception {
        switch (opcion) {
            case 1:
                System.out.println("""
                        Selecciono la opcion 1
                        ##############################################################
                        """ );
                break;
            case 2:
                System.out.println( implementacionApi.opcionTwoMenu());
                break;
            case 3:
                System.out.println("Selecciono la opcion 3");
                break;
            case 4:
                System.out.println("Selecciono la opcion 4");
                break;
            case 5:
                System.out.println("Selecciono la opcion 5");
                break;
            case 0:
                System.out.println("Saliendo...");
                System.exit(0);
            default:
                System.out.println("Opcion invalida");
        }
    }
}
