package javacore.Hheritage.test;

import javacore.Hheritage.domain.Staff;

public class Main {
    public static void main(String[] args){

        System.out.println("Hello, world.");
        Staff staff = new Staff();

        staff.setName("Angell Belger");
        staff.setCpf("453.232.340.07");
        staff.setAge(25);
        staff.setRole("Software Engineer");
        staff.setSalary(70170);

        staff.printData();

    }
}
