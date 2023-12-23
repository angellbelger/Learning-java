package javacore.Bmethodintroduction.test;

import javacore.Bmethodintroduction.domain.Students;

public class TestStudent2 {
    public static void main(String[] args){
        Students student01 = new Students();
        Students student02 = new Students();

        student01.name = "Angell Belger";
        student01.age = 34;
        student01.gender = 'M';

        student02.name = "Ada Belger";
        student02.age = 1;
        student02.gender = 'F';

        student01.talk();
        System.out.println("--------------------");
        student02.talk();
    }
}
