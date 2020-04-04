package com.company.ejercicio2;
import java.util.UUID;
import java.time.*;

public class Factura {

    private UUID idFactura;
    private double montoTotal;
    private double montoConDescuento;
    private LocalDate fecha;
    private Cliente cliente;
    private ItemVenta[] items;

    public void Factura(Cliente cliente,ItemVenta[] items,int cantidadItems){

        this.idFactura = UUID.randomUUID();
        this.items = items;
        this.calcularMontoTotal(cantidadItems);
        this.fecha = LocalDate.now();
        this.cliente = cliente;
        this.aplicarDescuento();

    }
    public void calcularMontoTotal(int cantidadItems){
        int i=0;
        double monto=0;
        while(i< cantidadItems){

            this.montoTotal += this.items[i].getPrecioUnitario();
            i++;
        }
    }
    public void aplicarDescuento(){

        double aDescontar = (this.cliente.getDescuento()) * this.montoTotal;
        this.montoConDescuento = this.montoTotal - aDescontar;

    }
    public void mostrarFactura(){

        System.out.println("------------------FACTURA------------------------------");
        System.out.printf("ID Factura: %s\n",this.idFactura);
        System.out.printf("Fecha: %s\n",this.fecha);
        System.out.printf("Monto total: $%.2f\n",this.montoTotal);
        System.out.printf("Monto con descuento: $%.2f\n",this.montoConDescuento);
        System.out.printf("ID Cliente: %s\n",this.cliente.getIdCliente());
        System.out.printf("Nombre del Cliente: %s\n",this.cliente.getApeNombre());
        System.out.printf("Email del Cliente: %s\n",this.cliente.getEmail());
        System.out.printf("Descuento aplicado: %.2f\n",this.cliente.getDescuento());
        System.out.println("-------------------------------------------------------");

    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getMontoConDescuento() {
        return montoConDescuento;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public UUID getIdFactura() {
        return idFactura;
    }
}
