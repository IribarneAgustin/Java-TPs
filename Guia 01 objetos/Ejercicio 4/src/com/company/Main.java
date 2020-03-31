package com.company;

public class Main {

    public static void main(String[] args) {


        Cuenta miCuenta = new Cuenta();

        miCuenta.crearCuenta(1,"Agustin",15000);
        double dinero = miCuenta.credito(2500);
        dinero = miCuenta.debito(1500);
        dinero = miCuenta.debito(30000);
        miCuenta.verCuenta();






    }
}
