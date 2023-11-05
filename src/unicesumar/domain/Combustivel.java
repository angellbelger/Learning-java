package unicesumar.domain;

public class Combustivel {
    private String tipo;
    private int estoque;

    private int limite;

    public Combustivel(String tipo, int limiteEstoque) {
        this.tipo = tipo;
        this.limite = limiteEstoque;
        this.estoque = 0;
    }

    public int reporEstoque(int quantidade) {
        if (quantidade < 0) {
            return 0;
        }

        int quantidadeReposta = Math.min(limite - estoque, quantidade);
        estoque += quantidadeReposta;
        return quantidadeReposta;
    }

    public int abastecerVeiculo(int quantidade) {
        if (quantidade < 0) {
            return 0;
        }

        int quantidadeAbastecida = Math.min(estoque, quantidade);
        estoque -= quantidadeAbastecida;
        return quantidadeAbastecida;
    }

    public int mostrarEstoque() {
        return estoque;
    }

}
