package Obras;

import Empleados.Empleado;

import java.util.ArrayList;

public class Comercio extends Comercial {
    private String rubro;

    public Comercio(String direccion, int cantidadMetrosCuadrados, int tiempoEstimado, double costoPorMetroCuadrado, String nombreDeLaObra,String rubro,ArrayList<Empleado> listaDePersonal){
        super(direccion, cantidadMetrosCuadrados, tiempoEstimado, costoPorMetroCuadrado,nombreDeLaObra,listaDePersonal);
        this.rubro = rubro;
    }


    public String getRubro() {
        return rubro;
    }
}
