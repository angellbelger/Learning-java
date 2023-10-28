package unicesumar.domain;

import unicesumar.run.Combustivel;

public class Atv1PrSisII {
    public static void main(String[] args){
        int limiteEstoque = 10000;
        Combustivel gasolina = new Combustivel("Gasolina", limiteEstoque);

        int qtdAposRepor = gasolina.reporEstoque(1000);
        System.out.println("Quantidade após reposicao: "+ qtdAposRepor);

        int qtdRealAposAbastecido1 = gasolina.abastecerVeiculo(51);
        System.out.println("Quantidade abastecida 1: "+ qtdRealAposAbastecido1);

        int qtdRealAposAbastecido2 = gasolina.abastecerVeiculo(10);
        System.out.println("Quantidade abastecida 2: "+ qtdRealAposAbastecido2);


    }
}
