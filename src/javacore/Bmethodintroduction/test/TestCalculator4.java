package javacore.Bmethodintroduction.test;

import javacore.Bmethodintroduction.domain.Calculator;

public class TestCalculator4 {
    public static void main(String[] args){
        Calculator calc = new Calculator();

        int[] list = {1, 2, 3, 4, 5, 6, 7};

        calc.sumArray(list);
    }
}
