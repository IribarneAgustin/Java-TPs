package com.company;

import ejercicio1.Cilindro;
import ejercicio2.Persona;
import ejercicio2.Estudiante;
import ejercicio2.Staff;
import ejercicio3.Circulo;
import ejercicio3.Cuadrado;
import ejercicio3.Figura;
import ejercicio3.Rectangulo;


public class Main {

    public static void main(String[] args) {/*
        EJERCICIO 1


        Cilindro cilindrito = new Cilindro(10,3,"verde");
      //  cilindrito.mostrarCilindro();
        System.out.println(cilindrito.toString());
        System.out.printf("Area del cilindro: %.2f\n",cilindrito.area());



        Estudiante alumno1 = new Estudiante("40123111", "Franco", "Gigo", "fran@gmail.com", "zuviria 1111", 2020, 1700, "Programacion");
        Estudiante alumno2 = new Estudiante("41000222", "Juan", "Topo", "juan@gmail.com", "Constitucion 232", 2019, 2000, "Letras");
        Estudiante alumno3 = new Estudiante("42000333", "Pepe", "Grillo", "grillo@gmail.com", "Jara 2136", 2018, 2500, "Ingles");
        Estudiante alumno4 = new Estudiante("43000444", "Agus", "Iri", "agusiri@gmail.com", "Gascon 3232", 2017, 1700, "Programacion");

        System.out.println(alumno1.toString());
        System.out.println(alumno2.toString());
        System.out.println(alumno3.toString());
        System.out.println(alumno4.toString());

        Staff profesor1 = new Staff("1500000", "Gustavo", "Lorenzo", "asd@gmail.com", "luro 123", 50000, "Mañana");
        Staff limpieza = new Staff("2500000", "Leo", "Garcia", "leo@gmail.com", "Laprida 2333", 30000, "Tarde");
        Staff profesor2 = new Staff("40122233", "Guille", "Bauer", "guille@gmail.com", "hernandarias 3223", 70000, "Mañana");
        Staff profesor3 = new Staff("39123145", "Macarena", "Perez", "macaperez@gmail.com", "camet 8000", 40000, "Tarde");

        System.out.println(profesor1.toString());
        System.out.println(profesor2.toString());
        System.out.println(profesor3.toString());
        System.out.println(limpieza.toString());

        //creo array y lo cargo
        Persona array[] = new Persona[10];
        int i = 0;
        int cantEstudiantes = 0;
        int cantStaff = 0;

        array[0] = alumno1;
        array[1] = alumno2;
        array[2] = alumno3;
        array[3] = alumno4;
        array[4] = profesor1;
        array[5] = profesor2;
        array[6] = profesor3;
        array[7] = limpieza;


        //Muestro cantidad de estudiantes y staff
        while (i < 8) {

            if (array[i] instanceof Estudiante) {
                cantEstudiantes++;
            } else {
                cantStaff++;
            }
            i++;
        }

        System.out.printf("Hay %d estudiantes y %d miembros del staff\n", cantEstudiantes, cantStaff);

        //muestro el total de cuota mensual que ingresa por parte de los estudiantes
        i = 0;
        double totalCuota = 0;

        while (i < 8) {

            if (array[i] instanceof Estudiante) {
                totalCuota += ((Estudiante) array[i]).getCuotaMensual();
            }
            i++;
        }

        System.out.printf("El ingreso total por parte de los estudiantes es de $" + totalCuota);
    }

    */

        //EJERCICIO 3

        Circulo circulo1 = new Circulo("Rojo", 20);
        System.out.println(circulo1.toString());
        Rectangulo rectangulo = new Rectangulo("Verde", 2, 2);
        System.out.println(rectangulo.toString());
        Cuadrado cuadrado = new Cuadrado("", 2, 5);
        System.out.println(cuadrado.toString());


    }

}


