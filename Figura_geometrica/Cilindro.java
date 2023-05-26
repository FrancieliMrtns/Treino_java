package Figura_geometrica;

public class Cilindro extends Circulo {
    private double altura;

    public Cilindro(double x, double y, double raio, double altura) {
        super(x, y, raio);
        this.altura = altura;
    }

    public void imprimir() {
        System.out.println("Cilindro:");
        System.out.println("Base: ");
        super.imprimir();
        System.out.println("Altura: " + altura);
        System.out.println("Volume: " + calcularVolume());
    }

    public double calcularArea() {
        return (2 * super.calcularArea()) + (2 * Math.PI * getRaio() * altura);
    }

    public double calcularVolume() {
        return super.calcularArea() * altura;
    }
    
    public double getRaio() {
        return raio;
    }
}