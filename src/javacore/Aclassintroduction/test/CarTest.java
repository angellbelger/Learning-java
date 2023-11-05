package javacore.Aclassintroduction.test;

import javacore.Aclassintroduction.domain.Cars;
import java.util.Scanner;

public class CarTest {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Cars[] list = new Cars[2];

        for (int i = 0; i < list.length; i++){
            Cars car = new Cars();
            System.out.println("Informe a descrição do carro "+i);

            System.out.println("Nome do carro: ");
            car.name = reader.next();

            System.out.println("Modelo do carro: ");
            car.model = reader.next();

            System.out.println("Ano de fabricacao: ");
            car.year = reader.nextInt();

            list[i] = car;

        }

        System.out.println("-------------- Carros Registrados --------------");
        for (int i = 0; i < list.length; i++){
            System.out.println("Carro número "+i);
            System.out.println("Nome do carro: "+list[i].name);
            System.out.println("Modelo do carro: "+list[i].model);
            System.out.println("Ano de fabricacao: "+list[i].year);
            System.out.println("---------------");
        }

    }
}
