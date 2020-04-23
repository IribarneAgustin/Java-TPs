package com.company;


public class Pelicula implements Comparable<Pelicula> {

    private String titulo;
    private String fechaDeLanzamiento;
    private int duracion;
    private String audiencia;
    private String paisDeOrigen;
    private String descripcion;
    private int cantidad;
    private String genero;
    private int vecesAlquilada;

    public Pelicula(String titulo, String fechaDeLanzamiento, int duracion, String audiencia, String paisDeOrigen, String descripcion, int cantidad, String genero, int vecesAlquilada) {
        this.titulo = titulo;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.duracion = duracion;
        this.audiencia = audiencia;
        this.paisDeOrigen = paisDeOrigen;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.genero = genero;
        this.vecesAlquilada = vecesAlquilada;

    }

    public void verPelicula() {
        System.out.println("---------------------------");
        System.out.println("Titulo: " + titulo + "\nFecha de lanzamiento: " + fechaDeLanzamiento + "\nDuracion (minutos): " + duracion + "\nAudiencia: " + audiencia + "\nPais de origen: " + paisDeOrigen + "\nDescripción: " + descripcion + "\nCantidad: " + cantidad + "\nGenero: " + genero + "\nVeces alquilada: " + vecesAlquilada);
        System.out.println("---------------------------\n");
    }
    public void disminuirStock(){
        this.cantidad--;
    }
    public void aumentarVecesAlquilada(){
        this.vecesAlquilada++;
    }

      public int verificarCantidad() {
        int i = 0;
        if (this.cantidad > 0) {
            i = this.cantidad;
        }
        return i;
    }

    @Override
    public int compareTo(Pelicula o) {
        int flag=0;
        if(o.getVecesAlquilada() < this.vecesAlquilada)
            flag=-1;

        return flag;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getVecesAlquilada() {
        return vecesAlquilada;
    }

    public String getAudiencia() {
        return audiencia;
    }

    public String getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public String getGenero() {
        return genero;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

}
