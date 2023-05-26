package Exercicio_bebida_heranca;

class Refrigerante extends Bebida {
    private boolean retornavel;

    public Refrigerante(String nome, double preco, boolean retornavel) {
        super(nome, preco);
        this.retornavel = retornavel;
    }

    public boolean isRetornavel() {
        return retornavel;
    }

    public void setRetornavel(boolean retornavel) {
        this.retornavel = retornavel;
    }

    public void mostraBebida() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Retornável: " + retornavel);
    }
  
}

