package com.company.ejercicio3;

import java.util.Scanner;
import java.util.UUID;

public class Cuenta {

    private UUID idCuenta;
    private Cliente cliente;
    private double balance;
    private double saldoDeudor;
    private String[] historialDeOperaciones = new String[10];
    private int cantidadOperaciones = 0;


    public Cuenta(Cliente cliente, double saldoInicial) {

        this.balance = saldoInicial;
        this.cliente = cliente;
        this.idCuenta = UUID.randomUUID();
        this.saldoDeudor = 0;
    }

    public void mostrarCuenta() {
        System.out.println("-----------------CUENTA------------------");
        System.out.printf("ID: %s\n", this.idCuenta);
        System.out.printf("Nombre: %s\n", this.cliente.getApeNombre());
        System.out.printf("Balance: $%.2f\n", this.balance);
        System.out.printf("Saldo deudor: $%.2f\n", this.saldoDeudor);
        System.out.println("-----------------------------------------\n");

    }

    public void depositar(double aDepositar) {
        this.balance += aDepositar;
        this.registrarDeposito(aDepositar);
    }

    public void extraer(double aRetirar) {
        if (aRetirar > this.balance) {
            System.out.println("Saldo insuficiente\n");
            this.extraerSaldoDeudor();
        } else {
            this.balance -= aRetirar;
            this.registrarExtraccion(aRetirar);
        }
    }

    public void extraerSaldoDeudor() {
        Scanner scan = new Scanner(System.in);
        double aDeber = 0;

        if (this.saldoDeudor < 2000) {
            System.out.printf("Su deuda actual es de $%.2f. Si desea un prestamo ingrese el monto, recuerde que el límite" +
                    "son $2000\n", this.saldoDeudor);
            aDeber = scan.nextDouble();
            if ((aDeber + this.saldoDeudor) <= 2000) {
                this.balance = 0;
                this.saldoDeudor += aDeber;
                this.registrarExtraccion(aDeber);

            } else {
                System.out.printf("El monto ingresado excede el limite de su deuda\n");
            }

        } else {
            System.out.printf("Ha alcanzado el limite de deuda\n");

        }

    }


    public void registrarDeposito(double aDepositar) {
        if (cantidadOperaciones < 10) {
            this.historialDeOperaciones[this.cantidadOperaciones] = "El cliente " + this.cliente.getApeNombre() + " depositó $" + aDepositar;
            this.cantidadOperaciones++;
        }
    }

    public void registrarExtraccion(double aExtraer) {
        if (cantidadOperaciones < 10) {
            this.historialDeOperaciones[this.cantidadOperaciones] = "El cliente " + this.cliente.getApeNombre() + " retiró $" + aExtraer;
            this.cantidadOperaciones++;
        }

    }


    public void mostrarHistorial() {
        int i = 0;

        System.out.println("Historial de operaciones");

        while (i < this.cantidadOperaciones) {
            System.out.printf("%s\n", this.historialDeOperaciones[i]);
            i++;
        }

    }


}



