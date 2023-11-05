package javacore.Bmethodintroduction.domain;

public class PrintStudent {
    public void print(Students student){
        System.out.println("--------------------");
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);

        student.name = "Gohan";

    }
}
