package javacore.Bmethodintroduction.test;

import javacore.Bmethodintroduction.domain.Calculator;

public class TestCalculator5 {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        int[] numbers = {1,2,3,4,5};

        calc.sumArray(numbers);
        System.out.println("------------------");
        calc.sumVarArgs(1,2,3,4,5,6);

    }
}
