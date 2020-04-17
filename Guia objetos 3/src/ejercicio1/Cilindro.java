package ejercicio1;
import java.lang.Math;

public class Cilindro extends Circulo {

    private double altura=1;


    public Cilindro(double altura,double radio,String color){
        super(radio,color);
        this.altura = altura;

    }
    public void mostrarCilindro(){
        System.out.println("----------CILINDRO-------------");
        System.out.println("Subclase de circulo "+ super.toString() + "\nAltura: " + altura);
        System.out.println("-------------------------------\n");
    }

    public String toString(){
        return "Subclase de circulo "+ super.toString() + "\nAltura: " + altura;
    }

    @Override
    public double area() {
        return (super.area() + 2 * Math.PI * this.getRadio() * this.altura);
    }


    public double volumen(){
        return (super.area() * this.altura);
    }

    public double getAltura() {
        return altura;
    }
}
