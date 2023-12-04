package javacore.Hheritage.domain;

public class People {
    private String name;
    private String cpf;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCpf(){
        return cpf;
    }

    public int getAge(){
        return age;
    }
}
