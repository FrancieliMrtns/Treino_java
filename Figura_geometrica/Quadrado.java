package Figura_geometrica;

public class Quadrado extends Ponto {
    private double lado;

    public Quadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    public void imprimir() {
        System.out.println("Quadrado:");
        System.out.println("Canto superior esquerdo: (" + getX() + ", " + getY() + ")");
        System.out.println("Lado: " + lado);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}

