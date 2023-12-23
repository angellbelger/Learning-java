package unicesumar.test3.domain;

public class Staff extends People{
    private String role;
    private double salary;

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }

    public void printData(){
        System.out.println("Name: "+this.getName());
        System.out.println("SSN: "+this.getSsn());
    }
}
