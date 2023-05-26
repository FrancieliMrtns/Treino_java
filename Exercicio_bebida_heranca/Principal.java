package Exercicio_bebida_heranca;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Refrigerante[] refrigerantes = new Refrigerante[3];
        Suco[] sucos = new Suco[3];
        Vinho[] vinhos = new Vinho[3];
        int opcao;
        boolean sair = false;

        while (!sair) {
            System.out.println("----- MENU -----");
            System.out.println("1. Cadastrar");
            System.out.println("2. Imprimir");
            System.out.println("3. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarBebida(refrigerantes, sucos, vinhos, scanner);
                    break;
                case 2:
                    imprimirBebidas(refrigerantes, sucos, vinhos);
                    break;
                case 3:
                    sair = true;
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    public static void cadastrarBebida(Refrigerante[] refrigerantes, Suco[] sucos, Vinho[] vinhos, Scanner scanner) {
        System.out.println("----- CADASTRO DE BEBIDA -----");
        System.out.println("1. Refrigerante");
        System.out.println("2. Suco");
        System.out.println("3. Vinho");
        System.out.print("Digite o tipo de bebida a cadastrar: ");
        int tipoBebida = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Digite o nome da bebida: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço da bebida: ");
        double preco = scanner.nextDouble();

        switch (tipoBebida) {
            case 1:
                System.out.print("A bebida é retornável? (true/false): ");
                boolean retornavel = scanner.nextBoolean();

                for (int i = 0; i < refrigerantes.length; i++) {
                    if (refrigerantes[i] == null) {
                        refrigerantes[i] = new Refrigerante(nome, preco, retornavel);
                        System.out.println("Refrigerante cadastrado com sucesso!");
                        break;
                    }
                }
                break;
            case 2:
                scanner.nextLine(); 
                System.out.print("Digite o sabor do suco: ");
                String sabor = scanner.nextLine();

                for (int i = 0; i < sucos.length; i++) {
                    if (sucos[i] == null) {
                        sucos[i] = new Suco(nome, preco, sabor);
                        System.out.println("Suco cadastrado com sucesso!");
                        break;
                    }
                }
                break;
            case 3:
                System.out.print("Digite a safra do vinho: ");
                int safra = scanner.nextInt();

                for (int i = 0; i < vinhos.length; i++) {
                    if (vinhos[i] == null) {
                        vinhos[i] = new Vinho(nome, preco, safra);
                        System.out.println("Vinho cadastrado com sucesso!");
                        break;
                    }
                }
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }

    public static void imprimirBebidas(Refrigerante[] refrigerantes, Suco[] sucos, Vinho[] vinhos) {
        System.out.println("----- IMPRESSÃO DE BEBIDAS -----");
        System.out.println("Refrigerantes:");
        for (Refrigerante refrigerante : refrigerantes) {
            if (refrigerante != null) {
                refrigerante.mostraBebida();
                System.out.println("--------------------");
            }
        }

        System.out.println("Sucos:");
        for (Suco suco : sucos) {
            if (suco != null) {
                suco.mostraBebida();
                System.out.println("--------------------");
            }
        }

        System.out.println("Vinhos:");
        for (Vinho vinho : vinhos) {
            if (vinho != null) {
                vinho.mostraBebida();
                System.out.println("--------------------");
            }
        }
    }
    
}