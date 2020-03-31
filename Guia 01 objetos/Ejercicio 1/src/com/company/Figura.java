package com.company;

public class Figura {
    private float ancho=1;
    private float alto=1;

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return this.ancho;
    }

    public float getAlto() {
        return this.alto;
    }

    public float area(float alto, float ancho) {
        return (alto * ancho);
    }

    public float perimetro(float alto, float ancho) {
        return ((alto * 2) + (ancho * 2));

    }

}
