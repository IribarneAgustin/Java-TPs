package com.company;

public class Cliente {
    private String nombre;
    private String telefono;
    private String direccion;
    private Alquiler alquileres[] = new Alquiler[9];
    private int peliculasAlquiladas; // validos del arreglo

    public Cliente(){};

    public Cliente(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.peliculasAlquiladas = 0;

    }
    public void mostrarArrayAlquileres(){
        int i;

        for (i=0; i < this.peliculasAlquiladas; i++){
            this.alquileres[i].mostrarAlquiler();
        }
    }

    public void agregarAlquilerAhistorial(Alquiler nuevo) {
        this.alquileres[peliculasAlquiladas] = nuevo;
        this.peliculasAlquiladas++;
    }


    public String getNombre() {
        return nombre;
    }

    public Alquiler[] getAlquileres() {
        return alquileres;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getPeliculasAlquiladas() {
        return peliculasAlquiladas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}



