package Heranca;
import java.util.Scanner;

public class Horista extends Empregado {
    private double valor_hora;
    private int horas_trabalhadas;
    
    public Horista(int numero, String nome, double valor_hora, int horas_trabalhadas) {
        super(numero, nome);
        this.valor_hora = valor_hora;
        this.horas_trabalhadas = horas_trabalhadas;
    }
    
    public double valor_do_salario() {
        return valor_hora * horas_trabalhadas;
    }
}
