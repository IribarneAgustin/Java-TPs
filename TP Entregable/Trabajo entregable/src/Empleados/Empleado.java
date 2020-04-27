package Empleados;

public abstract class Empleado {
    private String nombre;
    private String dni;
    private String telefono;
    private int costo;


    public Empleado(String nombre, String dni, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String toString() {
        return ("Nombre: " + getNombre() + " DNI: " + getDni() + " Telefono: "+getTelefono()+" Costo por dia: "+getCosto());
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCosto() {
        return costo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
}
