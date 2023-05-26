package Exercicio_banco_agregacao;

import java.util.Scanner;

public class Cartao {
    private String senha;

    public Cartao() {
        cadastrarSenha();
    }

    private void cadastrarSenha() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Cadastre sua senha: ");
            String senha1 = scanner.nextLine();

            System.out.println("Confirme sua senha: ");
            String senha2 = scanner.nextLine();

            if (senha1.equals(senha2)) {
                senha = senha1;
                System.out.println("Senha cadastrada com sucesso.");
                break;
            } else {
                System.out.println("As senhas não coincidem. Tente novamente.");
            }
        }
    }

    public boolean verificaSenha() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senhaInformada = scanner.nextLine();

        if (senhaInformada.equals(senha)) {
            return true;
        } else {
            System.out.println("Senha incorreta.");
            return false;
        }
    }

    public void setSenha() {
        Scanner scanner = new Scanner(System.in);

        if (verificaSenha()) {
            while (true) {
                System.out.println("Digite a nova senha: ");
                String novaSenha1 = scanner.nextLine();

                System.out.println("Confirme a nova senha: ");
                String novaSenha2 = scanner.nextLine();

                if (novaSenha1.equals(novaSenha2)) {
                    senha = novaSenha1;
                    System.out.println("Senha alterada.");
                    break;
                } else {
                    System.out.println("As senhas não coincidem");
                }
            }
        } else {
            System.out.println("Acesso negado. Não é possível alterar a senha.");
        }
    }
}
