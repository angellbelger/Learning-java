package javacore.Fstaticmodify.domain;

public class Cars {
    private String name;
    private double maximumSpeed;
    private static double limitSpeed = 250;
    private int year;

    public Cars(String name, double limitSpeed){
        this.name = name;
        this.maximumSpeed = limitSpeed;
    }

    public Cars(String name, double limitSpeed, int year){
        this(name, limitSpeed);
        this.year = year;
    }

    public void printCar(){
        System.out.println("---------------------");
        System.out.println("Name: "+ name +"\nMaximum speed: "+ maximumSpeed + "\nlimit speed:" + limitSpeed);
        System.out.println("Year: "+ year);
    }

    public static void setLimitSpeed(double limitSpeed) {
        Cars.limitSpeed = limitSpeed;
    }
}

