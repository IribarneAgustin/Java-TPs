package com.company.ejercicio2;
import java.awt.*;
import java.util.UUID;

public class Cliente {
    private UUID idCliente;
    private String apeNombre;
    private String email;
    private double descuento;


    public void Cliente(String apeNombre, String email,double descuento){
        this.idCliente = UUID.randomUUID();
        this.apeNombre = apeNombre;
        this.email = email;
        this.descuento = descuento;
    }
    public void mostrarCliente(){
        System.out.println("---------CLIENTE-----------");
        System.out.printf("ID: %s\n",this.idCliente);
        System.out.printf("Nombre: %s\n",this.apeNombre);
        System.out.printf("Email: %s\n",this.email);
        System.out.printf("Descuento: %.2f\n",this.descuento);
        System.out.println("--------------------------\n");
    }

    public String getEmail() {
        return email;
    }

    public UUID getIdCliente() {
        return idCliente;
    }

    public double getDescuento() {
        return descuento;
    }

    public String getApeNombre() {
        return apeNombre;
    }
}
