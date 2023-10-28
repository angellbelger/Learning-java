package javacore.classintroduction.test;

import javacore.classintroduction.domain.Professors;

public class ProfessorTest {
    public static void main(String[] args){
        Professors professor = new Professors();

        professor.name = "edwart tate";
        professor.age = 44;
        professor.height = 1.80F;

        System.out.println("Hello, Mr. "+professor.name+".");
    }
}
