package Obras;

import Empleados.Empleado;

import java.util.ArrayList;

public class Domestica extends Obra {

    private int cantidadHabitaciones;

    public Domestica(String direccion, int cantidadMetrosCuadrados, int tiempoEstimado, double costoPorMetroCuadrado,int cantidadHabitaciones,ArrayList<Empleado> listaDePersonal){
        super(direccion, cantidadMetrosCuadrados, tiempoEstimado, costoPorMetroCuadrado,listaDePersonal);
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    @Override
    public String verPrecioEstimado() {
        return ("Obra Domestica\n" + super.verPrecioEstimado());
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }
}
