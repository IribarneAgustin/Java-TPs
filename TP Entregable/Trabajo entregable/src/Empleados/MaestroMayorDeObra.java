package Empleados;

public class MaestroMayorDeObra extends Empleado implements TrabajoEmpleado {

    private int edad;

    public MaestroMayorDeObra(String nombre,String dni,String telefono,int edad){
        super(nombre, dni, telefono);
        this.edad = edad;
        this.setCosto(1800);
    }


    @Override
    public void construir() {
        System.out.println("Soy un maestro mayor de obra y superviso\n");
    }

    public int getEdad() {
        return edad;
    }
}
