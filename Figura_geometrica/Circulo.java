package Figura_geometrica;

import java.lang.Math;

public class Circulo extends Ponto {
    public double raio;

    public Circulo(double x, double y, double raio) {
        super(x, y);
        this.raio = raio;
    }

    public void imprimir() {
        System.out.println("Círculo:");
        System.out.println("Centro: (" + getX() + ", " + getY() + ")");
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
