package unicesumar.run;

import unicesumar.domain.Combustivel;

public class Atv1PrSisII {
    public static void main(String[] args){
        int limiteEstoque = 400;
        Combustivel gasolina = new Combustivel("gasolina", limiteEstoque);

        int qtdAposRepor = gasolina.reporEstoque(100);
        System.out.println("Quantidade após reposicao: "+ qtdAposRepor);

        int qtdRealAposAbastecido1 = gasolina.abastecerVeiculo(70);
        System.out.println("Quantidade abastecida 1: "+ qtdRealAposAbastecido1);

        int qtdRealAposAbastecido2 = gasolina.abastecerVeiculo(0);
        System.out.println("Quantidade abastecida 2: "+ qtdRealAposAbastecido2);

        System.out.println("Estoque de gasolina: "+ gasolina.mostrarEstoque());

    }
}
