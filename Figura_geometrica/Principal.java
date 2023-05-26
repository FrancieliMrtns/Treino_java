package Figura_geometrica;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circulo[] circulos = new Circulo[3];
        Cilindro[] cilindros = new Cilindro[3];
        Quadrado[] quadrados = new Quadrado[3];

        int opcao;

        do {
            System.out.println("\nOpções:");
            System.out.println("1. Círculo");
            System.out.println("2. Cilindro");
            System.out.println("3. Quadrado");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Círculo ---");
                    System.out.println("A. Cadastrar");
                    System.out.println("B. Imprimir");
                    System.out.println("C. Cálculo da Área");
                    System.out.println("D. Cálculo do Perímetro");
                    System.out.print("Escolha uma opção: ");
                    char opcaoCirculo = scanner.next().charAt(0);

                    switch (opcaoCirculo) {
                        case 'A':
                            for (int i = 0; i < 3; i++) {
                                System.out.print("Digite as coordenadas x e y do círculo " + (i+1) + ": ");
                                double x = scanner.nextDouble();
                                double y = scanner.nextDouble();
                                System.out.print("Digite o raio do círculo " + (i+1) + ": ");
                                double raio = scanner.nextDouble();
                                circulos[i] = new Circulo(x, y, raio);
                                System.out.println("Círculo " + (i+1) + " cadastrado com sucesso!");
                            }
                            break;
                        case 'B':
                            System.out.println("Círculos cadastrados:");
                            for (Circulo circulo : circulos) {
                                circulo.imprimir();
                                System.out.println("------------------------");
                            }
                            break;
                        case 'C':
                            System.out.println("Cálculo da Área:");
                            for (Circulo circulo : circulos) {
                                System.out.println("Área do círculo: " + circulo.calcularArea());
                                System.out.println("------------------------");
                            }
                            break;
                        case 'D':
                            System.out.println("Cálculo do Perímetro:");
                            for (Circulo circulo : circulos) {
                                System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
                                System.out.println("------------------------");
                            }
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("\n--- Cilindro ---");
                    System.out.println("A. Cadastrar");
                    System.out.println("B. Imprimir");
                    System.out.println("C. Cálculo da Área");
                    System.out.println("D. Cálculo do Volume");
                    System.out.print("Escolha uma opção: ");
                    char opcaoCilindro = scanner.next().charAt(0);

                    switch (opcaoCilindro) {
                        case 'A':
                            for (int i = 0; i < 3; i++) {
                                System.out.print("Digite as coordenadas x e y do cilindro " + (i+1) + ": ");
                                double x = scanner.nextDouble();
                                double y = scanner.nextDouble();
                                System.out.print("Digite o raio do cilindro " + (i+1) + ": ");
                                double raio = scanner.nextDouble();
                                System.out.print("Digite a altura do cilindro " + (i+1) + ": ");
                                double altura = scanner.nextDouble();
                                cilindros[i] = new Cilindro(x, y, raio, altura);
                                System.out.println("Cilindro " + (i+1) + " cadastrado com sucesso!");
                            }
                            break;
                        case 'B':
                            System.out.println("Cilindros cadastrados:");
                            for (Cilindro cilindro : cilindros) {
                                cilindro.imprimir();
                                System.out.println("------------------------");
                            }
                            break;
                        case 'C':
                            System.out.println("Cálculo da Área:");
                            for (Cilindro cilindro : cilindros) {
                                System.out.println("Área do cilindro: " + cilindro.calcularArea());
                                System.out.println("------------------------");
                            }
                            break;
                        case 'D':
                            System.out.println("Cálculo do Volume:");
                            for (Cilindro cilindro : cilindros) {
                                System.out.println("Volume do cilindro: " + cilindro.calcularVolume());
                                System.out.println("------------------------");
                            }
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("\n--- Quadrado ---");
                    System.out.println("A. Cadastrar");
                    System.out.println("B. Imprimir");
                    System.out.println("C. Cálculo da Área");
                    System.out.println("D. Cálculo do Perímetro");
                    System.out.print("Escolha uma opção: ");
                    char opcaoQuadrado = scanner.next().charAt(0);

                    switch (opcaoQuadrado) {
                        case 'A':
                            for (int i = 0; i < 3; i++) {
                                System.out.print("Digite as coordenadas x e y do quadrado " + (i+1) + ": ");
                                double x = scanner.nextDouble();
                                double y = scanner.nextDouble();
                                System.out.print("Digite o lado do quadrado " + (i+1) + ": ");
                                double lado = scanner.nextDouble();
                                quadrados[i] = new Quadrado(x, y, lado);
                                System.out.println("Quadrado " + (i+1) + " cadastrado com sucesso!");
                            }
                            break;
                        case 'B':
                            System.out.println("Quadrados cadastrados:");
                            for (Quadrado quadrado : quadrados) {
                                quadrado.imprimir();
                                System.out.println("------------------------");
                            }
                            break;
                        case 'C':
                            System.out.println("Cálculo da Área:");
                            for (Quadrado quadrado : quadrados) {
                                System.out.println("Área do quadrado: " + quadrado.calcularArea());
                                System.out.println("------------------------");
                            }
                            break;
                        case 'D':
                            System.out.println("Cálculo do Perímetro:");
                            for (Quadrado quadrado : quadrados) {
                                System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
                                System.out.println("------------------------");
                            }
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 4);
        scanner.close();
    }
}