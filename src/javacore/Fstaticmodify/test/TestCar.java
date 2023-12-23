package javacore.Fstaticmodify.test;

import javacore.Fstaticmodify.domain.Cars;

public class TestCar {
    public static void main(String []args){
        System.out.println("Hello, world.");

        Cars car1 = new Cars("Renegate", 200, 2022);
        Cars car2 = new Cars("BMW", 21, 2023);
        Cars car3 = new Cars("Lamborguini", 220, 2034);
        car1.setLimitSpeed(300);
        car1.printCar();
        car2.printCar();
        car3.printCar();
    }
}
