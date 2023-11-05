package javacore.Bmethodintroduction.test;

import javacore.Bmethodintroduction.domain.PrintStudent;
import javacore.Bmethodintroduction.domain.Students;

public class TestStudent {
    public static void main(String[] args){
        Students student01 = new Students();
        Students student02 = new Students();
        PrintStudent impressora = new PrintStudent();

        student01.name = "Angell Belger";
        student01.age = 34;
        student01.gender = 'M';

        student02.name = "Ada Belger";
        student02.age = 1;
        student02.gender = 'F';

        impressora.print(student01);
        impressora.print(student02);

        impressora.print(student01);
        impressora.print(student02);
    }


}
