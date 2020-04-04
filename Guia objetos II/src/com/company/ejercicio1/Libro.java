package com.company.ejercicio1;


import com.company.ejercicio1.Autor;

public class Libro {

    private String titulo;
    private float precio;
    private int stock;
    private Autor[] autores;
    private int cantidadAutores;



    public void mensaje() {

        System.out.printf("El libro %s se vende a %.2f y sus autores son:\n",this.titulo, this.precio);
        this.mostrarAutores();
    }




    public void Libro(String titulo, float precio, int stock,Autor[] autores,int cantidadAutores) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autores = autores;
        this.cantidadAutores = cantidadAutores;
    }




    public void modificarPrecio(float precioNuevo) {
        this.precio = precioNuevo;
    }

    public void aumentarStock(int cantidad) {
        this.stock += cantidad;
    }

    public void mostrarAutores(){
    int i=0;

        while(i < this.cantidadAutores){
            this.autores[i].mostrarAutor();
            i++;
        }
    }

    public void mostrarLibro() {
        System.out.println("------LIBRO-------");
        System.out.printf("Titulo: %s\n", this.titulo);
        System.out.printf("Precio: $%.2f\n", this.precio);
        System.out.printf("Stock: %d\n", this.stock);
        System.out.printf("------Autores------: \n");
        this.mostrarAutores();
    }

    public Autor[] getAutores() {
        return autores;
    }

    public float getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getTitulo() {
        return titulo;
    }
}
