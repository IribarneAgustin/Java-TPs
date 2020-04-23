package com.company;

import java.time.LocalDate;


public class Alquiler {
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private Cliente cliente;
    private Pelicula pelicula;

///ANTES DE UTILIZAR ESTE CONSTRUCTUR SE DEBE HABER VALIDADO QUE HAYA STOCK DISPONIBLE
    public Alquiler(Cliente cliente,Pelicula pelicula) {
        this.fechaAlquiler = LocalDate.now();
        this.fechaDevolucion = fechaAlquiler.plusDays(7);
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.pelicula.aumentarVecesAlquilada();
        this.pelicula.disminuirStock();
        this.cliente.agregarAlquilerAhistorial(this);
    }

    public void mostrarAlquiler() {
        System.out.println("El cliente " + this.cliente.getNombre() + " alquiló " + this.pelicula.getTitulo() + " el día " + this.fechaAlquiler);
    }

    public int consultarVigencia() { ///devuelve -1 si esta vencido, 0 si esta a la fecha y 1 si esta vigente

        int vigencia = this.fechaDevolucion.compareTo(LocalDate.now());

        return vigencia;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

}


