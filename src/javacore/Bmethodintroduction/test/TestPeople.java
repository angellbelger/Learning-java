package javacore.Bmethodintroduction.test;

import javacore.Bmethodintroduction.domain.People;

public class TestPeople {
    public static void main(String[] args){
        People people = new People();
        people.setAge(108);
        people.setName("Angell Belger");
        people.printData();
    }
}
