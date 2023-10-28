package javacore.classintroduction.test;

import javacore.classintroduction.domain.Students;

public class StudentTest {
    public static void main(String[] args){
        Students student = new Students();

        student.name = "Angell Belger";
        student.age = 18;
        student.height = 1.7F;
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.height);
    }
}
