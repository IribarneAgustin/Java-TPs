package ejercicio1;
import java.lang.Math;

public class Circulo {

    private double radio=1;
    private String color="rojo";

    public Circulo(double radio,String color){
        this.radio = radio;
        this.color = color;
    }

    public double area(){
        return (Math.PI * (this.radio * this.radio));
    }

    public void mostrarCirculo(){
        System.out.println("----------CIRCULO-------------");
        System.out.printf("Radio: %.2f\n",this.radio);
        System.out.printf("Color: %s\n",this.color);
        System.out.println("-------------------------------\n");
    }
    public String toString(){
        return "\nRadio: "+ radio + "\nColor: " + color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }
}
