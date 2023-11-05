package javacore.Bmethodintroduction.domain;

public class Staff {
    private String name;
    private int age;
    private double[] salary;
    private double sumSalary = 0;
    private double averageSal;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;

    }

    public void setSalary(double[] salary){
        this.salary = salary;

    }

    public void printData(){
        System.out.println(this.name);
        System.out.println(this.age);
        for (int i = 0; i < salary.length; i++) {
            System.out.print(salary[i]+" ");
        }
        average();
    }

    public void average(){
        if (salary == null){
            return;
        }
        for (int i = 0; i < salary.length; i++){
            sumSalary += salary[i];
        }
        this.averageSal = sumSalary / salary.length;
        System.out.println("\nAverage Salary:"+averageSal);

    }

}
