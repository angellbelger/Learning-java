package learning.java.begin;

import java.util.Scanner;

public class Ex009Reading {
    public static void main(String[] args){
        System.out.println("Hello, world.");
        System.out.print("Your name: ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Welcome, Mr. "+name);

        double value = 10;
        double valueFinal = value * (1-0.10);
        System.out.println(valueFinal);

        if (valueFinal%2 == 0){
            System.out.println("O numero é par");
        }else{
            System.out.println("O numero é impar");
        }
    }
}
