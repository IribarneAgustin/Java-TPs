package Obras;

import Empleados.Empleado;

import java.util.ArrayList;

public class Hotel extends Comercial {
    private int cantidadPisos;

    public Hotel(String direccion, int cantidadMetrosCuadrados, int tiempoEstimado, double costoPorMetroCuadrado, ArrayList<Empleado> listaDePersonal, String nombreDeLaObra,int cantidadPisos){
        super(direccion, cantidadMetrosCuadrados, tiempoEstimado, costoPorMetroCuadrado,nombreDeLaObra,listaDePersonal);
        this.cantidadPisos = cantidadPisos;
    }


    public int getCantidadPisos() {
        return cantidadPisos;
    }
}
