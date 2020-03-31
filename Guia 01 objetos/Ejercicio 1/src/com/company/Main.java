package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        Rectangulo miRectangulo = new Rectangulo();
        miRectangulo.crearRectangulo(10,20);
        float altura=miRectangulo.getAlto();
        float ancho=miRectangulo.getAncho();
        System.out.printf("El alto es %.2f y el ancho es de %.2f",altura,ancho);

        float area=miRectangulo.area(altura,ancho);
        float perimetro=miRectangulo.perimetro(altura,ancho);

        System.out.printf("\nEl area es de %.2f y el perimetro es de %.2f",area,perimetro);

        System.out.printf("Por favor introduzca su nueva altura\n");
        altura=scan.nextFloat();
        System.out.printf("Por favor introduzca su nuevo ancho\n");
        ancho=scan.nextFloat();

        area=miRectangulo.area(altura,ancho);
        perimetro=miRectangulo.perimetro(altura,ancho);

        System.out.printf("\nEl area es de %.2f y el perimetro es de %.2f",area,perimetro);




        


    }
}
