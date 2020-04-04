package com.company.ejercicio3;

import java.util.UUID;

public class Cliente {

    private UUID idCliente;
    private String apeNombre;
    private char sexo;

    public Cliente(String apeNombre,char sexo){
        this.apeNombre = apeNombre;
        this.sexo = sexo;
        this.idCliente = UUID.randomUUID();
    }
    public void mostrarCliente(){
        System.out.println("-----------------CLIENTE-----------------");
        System.out.printf("ID: %s\n",this.idCliente);
        System.out.printf("Nombre: %s\n",this.apeNombre);
        System.out.printf("Sexo: %c\n",this.sexo);
        System.out.println("-----------------------------------------\n");
    }

    public UUID getIdCliente() {
        return idCliente;
    }

    public String getApeNombre() {
        return apeNombre;
    }

    public char getSexo() {
        return sexo;
    }
}
