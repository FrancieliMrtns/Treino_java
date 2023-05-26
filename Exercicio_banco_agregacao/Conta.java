package Exercicio_banco_agregacao;

import java.util.Scanner;

public class Conta {
    private String nome;
    private int numero;
    private double saldo;
    private Cartao card;
    private String senha;

    public Conta(String nome, int numero, double saldo, Cartao card, String senha) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
        this.card = card;
        this.senha = senha;
    }

    public Conta(String nomeTitular, String numeroConta, double saldoInicial, Cartao cartao) {
	}

	public boolean depositar(double valor, String senhaInformada) {
        if (verificarSenha(senhaInformada)) {
            saldo += valor;
            return true;
        } else {
            System.out.println("Senha incorreta");
            return false;
        }
    }

    public boolean retirar(double valor, String senhaInformada) {
        if (verificarSenha(senhaInformada)) {
            if (saldo >= valor) {
                saldo -= valor;
                return true;
            } else {
                System.out.println("Saldo insuficiente");
                return false;
            }
        } else {
            System.out.println("Senha incorreta");
            return false;
        }
    }
    public double getSaldo(String senhaInformada) {
        if (verificarSenha(senhaInformada)) {
            return saldo;
        } else {
            System.out.println("Senha incorreta.");
            return -1;
        }
    }
    private boolean verificarSenha(String senhaInformada) {
        return senha.equals(senhaInformada);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Informe o saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Informe a senha: ");
        String senha = scanner.nextLine();

     
        Cartao card = new Cartao();

        
        Conta conta = new Conta(nome, numero, saldo, card, senha);

        System.out.println("Informe a senha: ");
        String senhaOperacoes = scanner.nextLine();

        
        if (conta.depositar(100.0, senhaOperacoes)) {
            System.out.println("Depósito realizado.");
        }

        if (conta.retirar(50.0, senhaOperacoes)) {
            System.out.println("Retirada realizada.");
        }

        double saldoAtual = conta.getSaldo(senhaOperacoes);
        if (saldoAtual >= 0) {
            System.out.println("Saldo atual: " + saldoAtual);
        }
    }
}
