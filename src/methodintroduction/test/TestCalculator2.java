package methodintroduction.test;

import methodintroduction.domain.Calculator;

public class TestCalculator2 {
    public static void main(String[] args){
        Calculator calc = new Calculator();

        System.out.println("The product: ");
        calc.multNumber(5, 6);

    }
}
