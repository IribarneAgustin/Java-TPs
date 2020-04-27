package Empleados;

import Empleados.Empleado;

public class Arquitecto extends Empleado {
    private int numeroDeMatricula;


    public Arquitecto(String nombre,String dni,String telefono,int numeroDeMatricula) {
        super(nombre, dni, telefono);
        this.setCosto(2000);
        this.numeroDeMatricula = numeroDeMatricula;
    }
    public void crearPlanos(){
        System.out.println("Creando mi proximo plano\n");
    }
    public int getNumeroDeMatricula() {
        return numeroDeMatricula;
    }
}
