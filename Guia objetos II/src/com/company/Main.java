package com.company;

public class Main {

    public static void main(String[] args) {



        //Instancio objeto autor y lo muestro
        Autor miAutor = new Autor();
        miAutor.Autor("Joshua", "Bloch", "Joshua@email.com", 'M');
        miAutor.mostrarAutor();

        Autor miAutor2 = new Autor();
        miAutor2.Autor("Agus", "Iri", "agusiri@gmail.com", 'M');
        miAutor2.mostrarAutor();


        Autor miAutor3 = new Autor();
        miAutor3.Autor("Pepe", "Grillo", "pepegrillo@gmail.com", 'F');
        miAutor3.mostrarAutor();

        //Creo array de autores

        Autor[] autores = new Autor[3];

        autores[0] = miAutor;
        autores[1] = miAutor2;
        autores[2] = miAutor3;



        //Instancio el objeto libro, agrego autores y lo muestro
        Libro miLibro = new Libro();
        miLibro.Libro("Effective Java", 450, 150,autores,3);

      //  miLibro.mostrarLibro();

        //Modifico precio y cantidad de stock y muestro el libro
		miLibro.modificarPrecio(500);
		miLibro.aumentarStock(50);
		miLibro.mostrarLibro();

		//Imprimo datos del autor, accediendo desde su libro
		miLibro.mostrarAutores();
		//Mensaje del objeto libro
		miLibro.mensaje();









    }
}
