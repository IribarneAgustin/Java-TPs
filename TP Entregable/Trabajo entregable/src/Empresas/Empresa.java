package Empresas;

import Empleados.Arquitecto;
import Empleados.Empleado;
import Empleados.MaestroMayorDeObra;
import Empleados.Obrero;
import Obras.Domestica;
import Obras.Obra;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Obra> listaObras;

    public Empresa(String nombre) {
        this.nombre = nombre;
        listaEmpleados = new ArrayList<Empleado>();
        listaObras = new ArrayList<Obra>();
    }

    public void agregarEmpleados(Empleado empleado) {

        if (empleado instanceof Empleado) {
            listaEmpleados.add(empleado);
        }
    }

    ///Devuelve la cantidad de arquitectos encontrados
    public int contarArquitectos() {
        int encontrados = 0;
        for (Empleado e : listaEmpleados) {
            if (e instanceof Arquitecto)
                encontrados++;
        }
        return encontrados;
    }


    ///Devuelve la cantidad de obreros encontrados
    public int contarObreros() {
        int encontrados = 0;
        for (Empleado e : listaEmpleados) {
            if (e instanceof Obrero)
                encontrados++;
        }
        return encontrados;
    }

    ///Devuelve la cantidad de maestros encontrados
    public int contarMaestros() {
        int encontrados = 0;
        for (Empleado e : listaEmpleados) {
            if (e instanceof MaestroMayorDeObra)
                encontrados++;
        }
        return encontrados;
    }

    ///Devuelve 1 en caso de tener personal suficiente y asignar la cantidad minima requerida, de lo contrario devuelve 0
    public int verificarCantidadDePersonal(int obreros, int maestros) {
        int flag = 0;

        if ((obreros >= 2) && (maestros < 4) && (maestros >= 1)) {
            //verifico si hay suficientes
            if (this.contarArquitectos() >= 1 && this.contarObreros() >= obreros && this.contarMaestros() >= maestros) {
                flag = 1;
            }
            else {
                System.out.println("No hay personal suficiente en la empresa\n");
            }
        } else {
            System.out.println("Debe asignar solo 1 arquitecto, entre 1 y 3 maestros mayores de obra y al menos 2 obreros para poder comenzar la obra\n");
        }
        return flag;
    }

    public ArrayList<Empleado> asignarPersonalEnObra(int obrero, int maestroMayorDeObra) {
        /// Creo una nueva lista auxiliar para el personal de la obra a comenzar
        ArrayList<Empleado> listaDePersonalaAsignar = new ArrayList<Empleado>();
        if(verificarCantidadDePersonal(obrero,maestroMayorDeObra) == 1) {
            for (Empleado e : listaEmpleados) {
                if (e instanceof Arquitecto) {
                    listaDePersonalaAsignar.add(e);
                } else if (e instanceof Obrero && obrero != 0) {
                    listaDePersonalaAsignar.add(e);
                    obrero--;
                } else if (e instanceof MaestroMayorDeObra && maestroMayorDeObra != 0) {
                    listaDePersonalaAsignar.add(e);
                    maestroMayorDeObra--;
                }

            }
        }

        return listaDePersonalaAsignar;
    }

    public void agregarObraAlista(Obra obra){
        this.listaObras.add(obra);
    }


    public void verObras(){
        for (Obra o : listaObras) {
            System.out.println("-------------------------------");
            System.out.println("Obra realizada en "+ o.getDireccion() +"\n"+ o.verPrecioEstimado());
            System.out.println("-------------------------------");

        }
    }


    public String getNombre() {
        return nombre;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public ArrayList<Obra> getListaObrasRealizadas() {
        return listaObras;
    }
}
