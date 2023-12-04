package unicesumar.PSII.test;

import unicesumar.PSII.domain.CalculadoraAreas;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------- Testando Interfaces ----------");
        CalculadoraAreas calc = new CalculadoraAreas();

        System.out.print("Area circulo: ");
        double areaCircle = calc.calcularAreaCirculo(10.0);
        System.out.println(areaCircle);

        System.out.print("Area quadrado: ");
        double areaSquare = calc.calcularAreaQuadrado(10.0, 10.0);
        System.out.println(areaSquare);
    }
}
