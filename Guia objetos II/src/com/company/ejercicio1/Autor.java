package com.company.ejercicio1;


public class Autor {

    private String nombre;
    private String ape;
    private String email;
    private char genero; //M o F

    public void Autor(String nombre,String ape,String email,char genero){
        this.nombre = nombre;
        this.ape = ape;
        this.email = email;
        this.genero = genero;
    }


    public void mostrarAutor(){

        System.out.println("------AUTOR-------");
        System.out.printf("Nombre: %s\n",this.nombre);
        System.out.printf("Apellido: %s\n",this.ape);
        System.out.printf("Email: %s\n",this.email);
        System.out.printf("Genero: %c\n",this.genero);
        System.out.println("-------------------\n");

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }

    public String getApe() {
        return ape;
    }

    public String getEmail() {
        return email;
    }
}
