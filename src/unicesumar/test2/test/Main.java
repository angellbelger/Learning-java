package unicesumar.test2.test;

import unicesumar.test2.domain.Trem;
import unicesumar.test2.domain.Veiculo;

public class Main {
    public static void main(String[] args){
        Trem trem = new Trem();
        Veiculo veiculo = new Veiculo();

        System.out.println("-----------------Veiculo-----------------");
        veiculo.locomover();

        System.out.println("-----------------Trem-----------------");
        trem.locomover();

    }
}
