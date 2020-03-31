package com.company;

public class Empleado {

    private String nombre;
    private String ape;
    private String dni;
    private double salario;

    public double calcularSalarioAnual()
    {
        return (this.salario)*12;
    }
    public void altaEmpleado(String nombre,String ape,String dni,double salario)
    {
        setSalario(salario);
        setDni(dni);
        setNombre(nombre);
        setApe(ape);
    }
    public void mostrarEmpleado()
    {
        System.out.println("\n-------------------------");
        System.out.printf("Nombre: %s\n",this.nombre);
        System.out.printf("Apellido: %s\n",this.ape);
        System.out.printf("DNI: %s\n",this.dni);
        System.out.printf("Salario: %.2f\n",this.salario);
        System.out.println("-------------------------\n");

    }
    public void aumentarSalario(double porcentaje)
    {
        double aSumar = (this.salario)*(porcentaje/100);
        double nuevo = (this.salario) + aSumar;
        this.salario = nuevo;
    }

    public String getNombre()
    {
        return this.nombre;
    }
    public String getApe()
    {
        return this.ape;
    }
    public String getDni()
    {
        return this.dni;
    }
    public double getSalario()
    {
        return this.salario;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
