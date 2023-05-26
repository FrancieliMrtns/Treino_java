package Exercicio_bebida_heranca;

class Suco extends Bebida {
    private String sabor;

    public Suco(String nome, double preco, String sabor) {
        super(nome, preco);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void mostraBebida() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Sabor: " + sabor);
    }
    
}