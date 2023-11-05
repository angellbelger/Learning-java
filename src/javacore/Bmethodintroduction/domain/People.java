package javacore.Bmethodintroduction.domain;

public class People {
    private String name;
    private int age;


    public void setName(String name){
        if (name == null){
            return;
        }else{
            this.name = name;
        }
    }

    public void setAge(int age){
        if (age < 0){
            return;
        }else{
            this.age = age;
        }
    }

    public String getName(){
        return this.name;

    }

    public int getAge(){
        return this.age;

    }

    public void printData(){
        System.out.println("Your name is: "+this.name);
        System.out.println("Your age is: "+this.age);
    }
}

