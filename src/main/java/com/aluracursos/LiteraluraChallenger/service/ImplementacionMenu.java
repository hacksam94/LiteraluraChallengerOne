package com.aluracursos.LiteraluraChallenger.service;
import com.aluracursos.LiteraluraChallenger.vista.Menu;

public class ImplementacionMenu {



   public static String opcionOneMenu() throws Exception{

       var implement = new ImplementacionApi();
       var	data = ImplementacionApi.searchBookForTitle();

       System.out.println(data);

   return "####################################################################";
   };


    public static String opcionTwoMenu() throws Exception {
        var implement = new ImplementacionApi();
        var	data = ImplementacionApi.listBooks();

        System.out.println(data);

        return "####################################################################";
    };




























}
