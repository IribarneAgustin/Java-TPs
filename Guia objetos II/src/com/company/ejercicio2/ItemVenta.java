package com.company.ejercicio2;
import java.util.UUID;


public class ItemVenta {
    private UUID idItem;
    private String nombre;
    private String descripcion;
    private double precioUnitario;


    public void ItemVenta(String nombre,String descripcion,double precioUnitario){
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.idItem = UUID.randomUUID();
    }
    public void mostrarItemVenta(){
        System.out.println("-------------Item------------------");
        System.out.printf("Nombre: %s\n",this.nombre);
        System.out.printf("Descripcion: %s\n",this.descripcion);
        System.out.printf("Precio Unitario: %f\n",this.precioUnitario);
        System.out.println("-----------------------------------");

    }


    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public UUID getIdItem() {
        return idItem;
    }
}
