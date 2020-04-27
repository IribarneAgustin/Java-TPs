package Obras;

import Empleados.Empleado;

import java.util.ArrayList;

public abstract class Comercial extends Obra {
    private String nombreDeLaObra;


    public Comercial(String direccion, int cantidadMetrosCuadrados, int tiempoEstimado, double costoPorMetroCuadrado,String nombreDeLaObra, ArrayList<Empleado> listaDePersonal){
        super(direccion, cantidadMetrosCuadrados, tiempoEstimado, costoPorMetroCuadrado,listaDePersonal);
        this.nombreDeLaObra = nombreDeLaObra;

    }

    @Override
    public String verPrecioEstimado() {
        return "Obra comercial llamada: "+getNombreDeLaObra()+"\n"+super.verPrecioEstimado();
    }

    public String getNombreDeLaObra() {
        return nombreDeLaObra;
    }
}