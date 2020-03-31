package com.company;

public class Item {

    private int id;
    private String descripcion;
    private int cantidad;
    private int precio;

    public Item(int id, String descripcion, int cantidad, int precio) {
        setId(id);
        setDescripcion(descripcion);
        setPrecio(precio);
        setCantidad(cantidad);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecio(int precio)
    {
        this.precio=precio;
    }
    public void setCantidad(int cant){
        this.cantidad = cant;
    }

    public void verItem() {
        System.out.printf("--------------\n");
        System.out.printf("ID:%d\n",this.id);
        System.out.printf("Descripcion:%s\n",this.descripcion);
        System.out.printf("Cantidad:%d\n",this.cantidad);
        System.out.printf("Precio Unitario: $%d\n",this.precio);
        System.out.printf("Precio Total: $%d\n",this.calcularPrecioTotal());
        System.out.printf("--------------\n");

    }

    public int calcularPrecioTotal() {
        return (this.cantidad)*(this.precio);
    }

    public int getId(){
        return this.id;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public int getPrecio(){
        return this.precio;
    }
    public String getDescripcion(){
        return this.descripcion;
    }

}
