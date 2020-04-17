package ejercicio2;

public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private String dirección;


    public Persona(String dni,String nombre,String apellido,String email,String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dirección = direccion;
        this.dni = dni;
        this.email = email;

    }
    public String toString(){
        return "\nNombre: " + nombre + "\nApellido: "+ apellido + "\nDireccion: " + dirección + "\nDni: " + dni + "\nEmail: " + email;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public String getDirección() {
        return dirección;
    }
}
