package ejercicio2;

public class Staff extends Persona{
    private double salario;
    private String turno; //Mañana o tarde

    public Staff(String dni,String nombre,String apellido,String email,String direccion,double salario,String turno){

        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public double salarioAnual(){

        return (this.salario * 12);
    }

    public String toString(){

        return "Staff\nSalario:$ "+salario+"\nTurno: "+turno+ super.toString();
    }

    public double getSalario() {
        return salario;
    }

    public String getTurno() {
        return turno;
    }
}
