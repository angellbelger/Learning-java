package javacore.Gassociation.test;

import javacore.Gassociation.domain.Professor;
import javacore.Gassociation.domain.School;

public class TestSchool {
    public static void main(String[] args){
        Professor teacher01 = new Professor("Andrew Tate");
        Professor teacher02 = new Professor("Sarah Smith");
        Professor teacher03 = new Professor("Ranzo Guthenbërg");
        Professor teacher04 = new Professor("Emaline Trindade");
        Professor[] professors = new Professor[]{teacher01, teacher02, teacher03, teacher04};

        School school = new School("Bullworth", professors);

        school.printSchool();

    }
}
