package Empleados;

public class Obrero extends Empleado implements TrabajoEmpleado{

    private int edad;

    public Obrero(String nombre,String dni,String telefono,int edad){
        super(nombre, dni, telefono);
        this.edad = edad;
        this.setCosto(1500);
    }

    @Override
    public void construir() {
        System.out.println("Soy un obrero y construyo\n");
    }

    public int getEdad() {
        return edad;
    }
}
