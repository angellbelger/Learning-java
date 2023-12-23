package unicesumar.test3.run;
import unicesumar.test3.domain.Staff;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello, world.");

        Staff staff = new Staff();
        staff.setName("Angell Belger");
        staff.setSsn("007.2313.007.11");
        staff.printData();

    }
}
