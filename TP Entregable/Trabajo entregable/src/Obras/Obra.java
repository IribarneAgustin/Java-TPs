package Obras;

import Empleados.Empleado;

import java.util.ArrayList;

public abstract class Obra {
    private String direccion;
    private int cantidadMetrosCuadrados;
    private int tiempoEstimado;
    private double costoPorMetroCuadrado;
    private ArrayList<Empleado> listaDePersonal;


    public Obra(String direccion, int cantidadMetrosCuadrados, int tiempoEstimado, double costoPorMetroCuadrado,ArrayList<Empleado> listaDePersonal) {
        this.direccion = direccion;
        this.cantidadMetrosCuadrados = cantidadMetrosCuadrados;
        this.tiempoEstimado = tiempoEstimado;
        this.costoPorMetroCuadrado = costoPorMetroCuadrado;
        this.listaDePersonal = listaDePersonal;
    }

    public void setListaDePersonal(ArrayList<Empleado> listaDePersonal) {
        this.listaDePersonal = listaDePersonal;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCantidadMetrosCuadrados(int cantidadMetrosCuadrados) {
        this.cantidadMetrosCuadrados = cantidadMetrosCuadrados;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public void setCostoPorMetroCuadrado(double costoPorMetroCuadrado) {
        this.costoPorMetroCuadrado = costoPorMetroCuadrado;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Empleado> getListaDePersonal() {
        return listaDePersonal;
    }

    public double getCostoPorMetroCuadrado() {
        return costoPorMetroCuadrado;
    }

    public int getCantidadMetrosCuadrados() {
        return cantidadMetrosCuadrados;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public int calcularCostoEmpleados(ArrayList<Empleado> lista) {
        int costo = 0;
        for (Empleado e : listaDePersonal) {
            costo += e.getCosto();
        }
        return costo;
    }

    public double calcularPrecioTotal(int costoEmpleados) {
        return (costoPorMetroCuadrado * cantidadMetrosCuadrados) + (costoEmpleados * tiempoEstimado);
    }
    public String verPrecioEstimado(){
        return("Gasto en empleados por día: $"+calcularCostoEmpleados(getListaDePersonal())+"\nPrecio TOTAL estimado: $"+calcularPrecioTotal(calcularCostoEmpleados(getListaDePersonal())));
    }
    public void verEmpleados(){
        System.out.println("Empleados de la obra");
        for (Empleado e : listaDePersonal) {
            System.out.println(e.toString());
        }
        System.out.println("------------------------------");
    }


}
