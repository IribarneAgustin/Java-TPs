package com.company;
import com.company.ejercicio1.Autor;
import com.company.ejercicio1.Libro;
import com.company.ejercicio2.Factura;
import com.company.ejercicio2.ItemVenta;
import com.company.ejercicio3.Cliente;
import com.company.ejercicio3.Cuenta;

public class Main {

    public static void main(String[] args) {

    //EJERCICIO 1///
    /*
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
    */
/*
        //EJERCICIO 2///

        ///Instancio objeto cliente

        Cliente miCliente = new Cliente();
        miCliente.Cliente("Iribarne Agustin","iri123@gmail.com",0.10);
        miCliente.mostrarCliente();

        ///Instancio 2 objetos Items
        ItemVenta item1 = new ItemVenta();
        ItemVenta item2 = new ItemVenta();
        ItemVenta item3 = new ItemVenta();
        item1.ItemVenta("Guitarra","Stratocaster 1959",5000);
        item2.ItemVenta("Amplificador","Marshall cellestion 100w",5000);
        item3.ItemVenta("Pedal distorsion","BOSS DS1",2000);

        ///Creo array de items
        ItemVenta[] items = new ItemVenta[3];
        items[0] = item1;
        items[1] = item2;
        items[2] = item3;

        ///Creo objeto factura
        Factura miFactura = new Factura();
        miFactura.Factura(miCliente,items,3);
        miFactura.mostrarFactura();
*/

        ///EJERCICIO 3

        Cliente miCliente = new Cliente("Iribarne Agustin",'M');
        miCliente.mostrarCliente();
        Cuenta miCuenta = new Cuenta(miCliente,10000);
       // miCuenta.extraer(11000);
        //miCuenta.extraer(11000);
        miCuenta.depositar(4000);
        miCuenta.depositar(5000);
        miCuenta.depositar(10000);
        miCuenta.extraer(5000);
        miCuenta.extraer(100);
        miCuenta.extraer(100);
        miCuenta.extraer(100);
        miCuenta.extraer(100);
        miCuenta.extraer(100);
        miCuenta.extraer(100);
        miCuenta.depositar(3000);
        miCuenta.mostrarHistorial();

        miCuenta.mostrarCuenta();















    }
}
