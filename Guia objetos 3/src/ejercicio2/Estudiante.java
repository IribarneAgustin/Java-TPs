package ejercicio2;

public class Estudiante extends Persona {
    private int añoIngreso;
    private double cuotaMensual;
    private String carrera;

    public Estudiante(String dni,String nombre,String apellido,String email,String direccion,int añoIngreso,double cuotaMensual, String carrera){

        super(dni, nombre, apellido, email, direccion);
        this.añoIngreso = añoIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }
    public String toString(){
        return "Estudiante\nAño de ingreso: "+añoIngreso+"\nCuota mensual: "+cuotaMensual+"\nCarrera: " +carrera + super.toString();
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public String getCarrera() {
        return carrera;
    }
}
