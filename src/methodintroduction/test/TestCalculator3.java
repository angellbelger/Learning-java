package methodintroduction.test;
import methodintroduction.domain.Calculator;

import java.util.Scanner;

public class TestCalculator3 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Calculator calc = new Calculator();
        double number1;
        double number2;
        double result;

        System.out.println("Primeiro numero: ");
        number1 = reader.nextDouble();
        System.out.println("Segundo numero: ");
        number2 = reader.nextDouble();
        result = calc.divNumber(number1, number2);
        System.out.print("The result of "+number1+" / "+number2+" = "+result);


    }
}
