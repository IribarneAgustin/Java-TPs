package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        VideoStore donVideo = new VideoStore();

        //Creo peliculas
        Pelicula peli1 = new Pelicula("Scary Moovie", "2/2/1992", 80, "+18", "Estados Unidos", "Pelicula de terror", 1, "Horror", 0);
        Pelicula peli2 = new Pelicula("Harry postre", "23/3/2000", 120, "ATP", "Reino Unido", "Pelicula fantastica", 20, "Horror", 10);
        Pelicula peli3 = new Pelicula("Scarface", "20/12/1983", 200, "+18", "Estados Unidos", "Pelicula de mafia", 30, "Accion", 0);
        Pelicula peli4 = new Pelicula("A prueba de todo", "5/11/1999", 90, "ATP", "Estados Unidos", "Pelicula de supervivencia", 30, "Documental", 0);
        //Las agrego a una lista
        donVideo.agregarPelicula(peli1);
        donVideo.agregarPelicula(peli2);
        donVideo.agregarPelicula(peli3);
        donVideo.agregarPelicula(peli4);

        //Creo Clientes
        Cliente cliente1 = new Cliente("Franco", "2235410022", "zuviria 1161");
        Cliente cliente2 = new Cliente("Pepe Grillo", "4615511", "luro 2322");
        Cliente cliente3 = new Cliente("Juan topo", "4512200", "Alsina 2020");
        Cliente cliente4 = new Cliente("Agus Iri", "154556699", "Rawson 2822");
        //Los agrego a una lista
        donVideo.agregarCliente(cliente1);
        donVideo.agregarCliente(cliente2);
        donVideo.agregarCliente(cliente3);
        donVideo.agregarCliente(cliente4);

        Alquiler alquiler1 = new Alquiler(cliente1,peli1);
        Alquiler alquiler2 = new Alquiler(cliente1,peli1);
        Alquiler alquiler3 = new Alquiler(cliente1,peli3);
        Alquiler alquiler4 = new Alquiler(cliente1,peli4);
        //Los agrego a una lista
        donVideo.agregarAlquiler(alquiler1);
        donVideo.agregarAlquiler(alquiler2);
        donVideo.agregarAlquiler(alquiler3);
        donVideo.agregarAlquiler(alquiler4);

        //Comienzo del programa
        //donVideo.verListaDePeliculas();
        //donVideo.verAlquileresVigentes();
       // donVideo.verDevolucionesParaHoy();
       // donVideo.verHistorialDeAlquileresDeUnCliente(cliente1);
     //   donVideo.verTitulosOrdenadosPorPopularidad();
        //donVideo.verTitulosMasPopularesPorGenero("Horror");
        //donVideo.verInfoDePelicula("Scary moovie");
        donVideo.alquilarPelicula();


    }
}
     /*   int menu;
        Scanner scan = new Scanner(System.in);

   System.out.println("Bienvenido que desea hacer?\n");
        System.out.println("1.Alquilar una película\n");
        System.out.println("2.Ver alquileres vigentes\n");
        menu = scan.nextInt();
        switch (menu) {
            case 1:
                donVideo.verListaDePeliculas();
                break;

                }


        }

    }

*/