package Heranca;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número, nome, salário base, valor de vendas e percentual de comissão do Vendedor:");
        int numeroVendedor = scanner.nextInt();
        scanner.nextLine(); 
        String nomeVendedor = scanner.nextLine();
        double salarioBaseVendedor = scanner.nextDouble();
        double valorVendasVendedor = scanner.nextDouble();
        double percComissaoVendedor = scanner.nextDouble();
        
        Vendedor e1 = new Vendedor(numeroVendedor, nomeVendedor, salarioBaseVendedor, valorVendasVendedor, percComissaoVendedor);
        
        System.out.println("Digite o número, nome e salário do Gerente:");
        int numeroGerente = scanner.nextInt();
        scanner.nextLine(); 
        String nomeGerente = scanner.nextLine();
        double salarioGerente = scanner.nextDouble();
        
        Gerente e2 = new Gerente(numeroGerente, nomeGerente, salarioGerente);
        
        System.out.println("Digite o número, nome, valor da hora e horas trabalhadas do Horista:");
        int numeroHorista = scanner.nextInt();
        scanner.nextLine(); 
        String nomeHorista = scanner.nextLine();
        double valorHoraHorista = scanner.nextDouble();
        int horasTrabalhadasHorista = scanner.nextInt();
        
        Horista e3 = new Horista(numeroHorista, nomeHorista, valorHoraHorista, horasTrabalhadasHorista);

        Empregado empregadoComMaiorSalario = obterEmpregadoComMaiorSalario(e1, e2, e3);
        System.out.println("Número do empregado: " + empregadoComMaiorSalario.getNumero());
        System.out.println("Nome do empregado: " + empregadoComMaiorSalario.getNome());
        System.out.println("Valor do salário: " + empregadoComMaiorSalario.valor_do_salario());
        
        scanner.close();
    }

    public static Empregado obterEmpregadoComMaiorSalario(Empregado... empregados) {
        Empregado empregadoMaiorSalario = empregados[0];
        double maiorSalario = empregadoMaiorSalario.valor_do_salario();

        for (int i = 1; i < empregados.length; i++) {
            double salarioAtual = empregados[i].valor_do_salario();
            if (salarioAtual > maiorSalario) {
                empregadoMaiorSalario = empregados[i];
                maiorSalario = salarioAtual;
            }
        }

        return empregadoMaiorSalario;
    }
}