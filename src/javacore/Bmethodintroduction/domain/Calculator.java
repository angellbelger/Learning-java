package javacore.Bmethodintroduction.domain;

public class Calculator {
    public void sumNumber(){
        System.out.println(7 + 3);
    }

    public void subNumber(){
        System.out.println(7 - 3);
    }

    public void multNumber(int x, int y){
        int result = x * y;
        System.out.println(result);
    }

    public double divNumber (double x, double y){

        if (y == 0){
            return 0;
        }
        double result = x / y;

        return result;

    }

    public void sumArray (int[] array){
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        System.out.println(total);
    }

    public void sumVarArgs(int...numbers){
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        System.out.println(total);
    }
}
