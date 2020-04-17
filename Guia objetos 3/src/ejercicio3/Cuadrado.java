package ejercicio3;

public class Cuadrado extends Rectangulo {

    public Cuadrado(String color, float alto, float largo) {
        super(color, alto, largo);
    }

    @Override
    public String toString() {
        return "Cuadrado " + super.getColor() + "\nAlto: " + alto + "\nLargo: " + largo + "\nArea: " + this.area() + "\nPerimetro: " + this.perimtero();
    }
}
