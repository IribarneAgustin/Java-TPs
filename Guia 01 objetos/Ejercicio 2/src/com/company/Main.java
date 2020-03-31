package com.company;

public class Main {

    public static void main(String[] args) {

        Empleado miEmpleado = new Empleado();
        Empleado miEmpleado2 = new Empleado();
        miEmpleado.altaEmpleado("Carlos","Gutierrez","23456345",25000);
        miEmpleado2.altaEmpleado("Ana","sanchez","34234123",27500);
        miEmpleado.mostrarEmpleado();
        miEmpleado2.mostrarEmpleado();

        //Modifico salario//

        miEmpleado.aumentarSalario(15);
        miEmpleado.mostrarEmpleado();
        double salarioAnual = miEmpleado.calcularSalarioAnual();
        System.out.printf("\nEl saldo anual es de %.2f",salarioAnual);
    }
}
