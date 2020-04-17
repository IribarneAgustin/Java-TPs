package ejercicio3;
import java.lang.Math;

public class Circulo extends Figura {

    private float radio;

    public Circulo(String color, float radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * (this.radio * this.radio);
    }

    @Override
    public double perimtero() {
        return 2 * Math.PI * this.radio;
    }

    public String toString() {
        return "\nCirculo: " + super.getColor() + "\nRadio: " + this.radio + "\nArea: " + this.area() + "\nPerimetro: " + this.perimtero();
    }

    public float getRadio() {
        return radio;
    }

}
