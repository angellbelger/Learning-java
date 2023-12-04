package javacore.Hheritage.domain;

public class Staff extends People{
    private String role;
    private double salary;

    public void setRole(String role){
        this.role = role;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getRole(){
        return role;
    }

    public double getSalary(){
        return salary;
    }

    public void printData(){
        System.out.println("-----------------------------------");
        System.out.println("Name: "+getName());
        System.out.println("Id: "+getCpf());
        System.out.println("Role: "+getRole());
        System.out.println("Salary: $US"+getSalary());
    }
}
