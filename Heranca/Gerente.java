package Heranca;
import java.util.Scanner;

public class Gerente extends Empregado {
    private double salario_mensal;
    
    public Gerente(int numero, String nome, double salario_mensal) {
        super(numero, nome);
        this.salario_mensal = salario_mensal;
    }
    
    public double valor_do_salario() {
        return salario_mensal;
    }
    
    
}
