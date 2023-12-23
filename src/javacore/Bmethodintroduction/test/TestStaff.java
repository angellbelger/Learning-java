package javacore.Bmethodintroduction.test;

import javacore.Bmethodintroduction.domain.Staff;

public class TestStaff {
    public static void main(String[] args){
        Staff staff = new Staff();
        //double[] salaries = new double[]{100000, 170000, 27000, 137170};

        staff.setName("Angell Belger");
        staff.setAge(24);
        staff.setSalary(new double[]{14000, 13700, 9000, 18000});
        //staff.setSalary(salaries);
        staff.printData();


    }
}
