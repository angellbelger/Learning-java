package javacore.Bmethodintroduction.test;

import javacore.Bmethodintroduction.domain.Calculator;

public class TestCalculator5 {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        int[] numbers1 = {1,2,3,4,5};
        //int[] numbers2 = new int[]{5, 4, 3, 2, 1};
        //double[] numbers3 = new double[5];
        float[] numbers4;

        calc.sumArray(numbers1);
        System.out.println("------------------");
        calc.sumVarArgs(1,2,3,4,5,6);
        System.out.println("------------------");
        calc.multNumber(10, 4);
        calc.divNumber(10, 0);

    }
}
