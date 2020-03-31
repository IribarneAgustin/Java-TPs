package com.company;

public class Main {

    public static void main(String[] args) {
	Hora horaActual = new Hora();
	horaActual.actualizarHora();
	horaActual.mostrarHora();
/*
	horaActual.restarUnSegundo();
	horaActual.mostrarHora();
*/
	horaActual.aumentarUnSegundo();
	horaActual.mostrarHora();


    }
}
