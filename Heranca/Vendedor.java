package Heranca;
import java.util.Scanner;

public class Vendedor extends Empregado {
    private double salario_base;
    private double valor_vendas_mes;
    private double perc_comissao;
    
    public Vendedor(int numero, String nome, double salario_base, double valor_vendas_mes, double perc_comissao) {
        super(numero, nome);
        this.salario_base = salario_base;
        this.valor_vendas_mes = valor_vendas_mes;
        this.perc_comissao = perc_comissao;
    }
    
    public double valor_do_salario() {
        return salario_base + (valor_vendas_mes * perc_comissao);
    }
}