package methodintroduction.test;

import methodintroduction.domain.Calculator;

public class TestCalculator {
    public static void main(String[] args){
        Calculator calc = new Calculator();

        System.out.print("The sum is: ");
        calc.sumNumber();
        System.out.print("The subtraction is: ");
        calc.subNumber();
    }
}
