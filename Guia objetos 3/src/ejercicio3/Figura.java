package ejercicio3;

public abstract class Figura {
    private String color;


    public Figura(String color) {
        this.color = color;
    }
    public abstract double area();
    public abstract double perimtero();


    public String getColor() {
        return color;
    }
}
