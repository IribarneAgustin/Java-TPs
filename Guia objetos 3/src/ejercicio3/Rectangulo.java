package ejercicio3;

public class Rectangulo extends Figura{

    public float alto;
    public float largo;

    public Rectangulo(String color,float alto,float largo){
        super(color);
        this.largo = largo;
        this.alto = alto;
    }
    public String toString(){
        return "Rectangulo "+super.getColor()+"\nAlto: "+alto+"\nLargo: "+largo+"\nArea: "+this.area()+"\nPerimetro: "+this.perimtero();
    }


    @Override
    public double perimtero() {
        return (this.alto *2) + (this.largo*2);
    }

    @Override
    public double area() {
        return this.alto * this.largo;
    }

    public float getAlto() {
        return alto;
    }

    public float getLargo() {
        return largo;
    }
}
