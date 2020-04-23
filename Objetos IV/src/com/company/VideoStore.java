package com.company;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;


public class VideoStore {
    private ArrayList<Pelicula> listaDePeliculas;
    private ArrayList<Cliente> listaDeClientes;
    private ArrayList<Alquiler> listaDeAlquileres;

    public VideoStore() {
        this.listaDePeliculas = new ArrayList();
        this.listaDeClientes = new ArrayList();
        this.listaDeAlquileres = new ArrayList();
    }

    public void agregarPelicula(Pelicula nuevo) {
        this.listaDePeliculas.add(nuevo);
    }

    public void agregarCliente(Cliente nuevo) {
        this.listaDeClientes.add(nuevo);
    }

    public void agregarAlquiler(Alquiler nuevo) {
        this.listaDeAlquileres.add(nuevo);

    }

    public void verListaDePeliculas() {
        for (Pelicula p : listaDePeliculas) {
            p.verPelicula();
        }
    }

    ///Retorna el indice de la lista en el que se agrega el cliente
    public int altaCliente() {
        Scanner scan = new Scanner(System.in);
        Cliente nuevo = new Cliente();
        int i = -1;
        System.out.println("Ingrese su nombre\n");
        nuevo.setNombre(scan.nextLine());
        System.out.println("Ingrese su telefono\n");
        nuevo.setTelefono(scan.nextLine());
        System.out.println("Ingrese su domicilio\n");
        nuevo.setDireccion(scan.nextLine());
        this.agregarCliente(nuevo);
        i = listaDeClientes.indexOf(nuevo);

        return i;
    }

    ///En caso de que exista, retorno el indice de la lista donde se encuentra, de lo contrario 0
    public int verificarExistenciaDePelicula(String titulo) {
        int flag = 0;
        int i;
        for (i = 0; i < this.listaDePeliculas.size() && flag == 0; i++) {
            if (listaDePeliculas.get(i).getTitulo().compareToIgnoreCase(titulo) == 0) {
                flag = 1;
            }

        }
        return flag;
    }


    public int verifcarDisponibilidad(String titulo) { ///RETORNA LA CANTIDAD EN CASO POSITIVO, DE LO CONTRARIO 0
        int i;
        int flag = 0;
        for (i = 0; i < this.listaDePeliculas.size() && flag == 0; i++) {
            flag = (listaDePeliculas.get(i)).verificarCantidad();
        }
        return flag;
    }


    ///En caso de que exista, retorno el indice de la lista donde se encuentra, de lo contrario 0
    public int verificarExistenciaDeClienteXdireccion(String direccion) {
        int i;
        int flag = 0;
        for (i = 0; i < this.listaDeClientes.size() && flag == 0; i++) {
            if (listaDeClientes.get(i).getDireccion().compareToIgnoreCase(direccion) == 0)
                flag = 1;
        }
        return flag;
    }

    public void generarBoleta(Cliente c, Pelicula p) {
        Alquiler nuevo = new Alquiler(c, p);
        this.listaDeAlquileres.add(nuevo);
        c.agregarAlquilerAhistorial(nuevo);
    }

    public void verAlquileresVigentes() {

        for (Alquiler a : listaDeAlquileres) {
            if (a.consultarVigencia() != -1)
                a.mostrarAlquiler();
        }
    }

    public void verDevolucionesParaHoy() {
        for (Alquiler a : listaDeAlquileres) {
            if (a.consultarVigencia() == 0)
                a.mostrarAlquiler();
        }
    }

    public void verHistorialDeAlquileresDeUnCliente(Cliente c) {

        if (c.getPeliculasAlquiladas() != 0)
            c.mostrarArrayAlquileres();
        else {
            System.out.println("El cliente no hizo ningún alquiler\n");
        }
    }


    public void verTitulosMasPopularesPorGenero(String genero) {
        ArrayList<Pelicula> aux = new ArrayList<Pelicula>();
        //Bajo a una lista auxiliar las peliculas del genero solicitado
        for (Pelicula p : listaDePeliculas) {
            if (p.getGenero().compareToIgnoreCase(genero) == 0) {
                aux.add(p);
            }
        }
        ///Ordeno mas populares
        Collections.sort(aux);
        //Muestro lista
        for (Pelicula p : aux) {
            p.verPelicula();
        }
    }


    public void verInfoDePelicula(String titulo) {
        for (Pelicula p : listaDePeliculas) {
            if (p.getTitulo().compareToIgnoreCase(titulo) == 0) {
                p.verPelicula();
            }
        }
    }


    public void verTitulosOrdenadosPorPopularidad() {
        Collections.sort(listaDePeliculas);
        this.verListaDePeliculas();
    }


    public void alquilarPelicula() {
        Scanner scan = new Scanner(System.in);
        String titulo;
        int indexPelicula;
        int indexCliente;
        int flag = 0;
        System.out.println("Ingrese el nombre de su película que desea alquilar\n");
        titulo = scan.nextLine();
        indexPelicula = verificarExistenciaDePelicula(titulo);

        if (indexPelicula == 0)
            System.out.println("La pelicula no existe\n");
        else {
            if (verifcarDisponibilidad(titulo) == 0)
                System.out.println("No hay disponibles para el alquiler\n");
            else {

                System.out.println("Ingrese la direccion del cliente");
                indexCliente = this.verificarExistenciaDeClienteXdireccion(scan.nextLine());
                if (indexCliente == 0) {
                    indexCliente = this.altaCliente();
                    System.out.println("Cliente registrado correctamente\n");
                }
                //Creo boleta y genero alquiler (EL constructor de Alquiler disminuye el stock y aumenta el contador
                // de veces alquilada
                this.generarBoleta(listaDeClientes.get(indexCliente), listaDePeliculas.get(indexPelicula));
                System.out.println("Alquiler registrado correctamente\n");
            }
        }


    }


}
