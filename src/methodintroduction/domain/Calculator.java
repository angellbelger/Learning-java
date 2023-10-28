package methodintroduction.domain;

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
}
