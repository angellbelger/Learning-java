package javacore.Gassociation.domain;

public class School {
    private String name;
    private Professor[] professors;

    public School(String name, Professor[] professors){
        this.name = name;
        this.professors = professors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void printSchool(){
        System.out.println("-------------------------");
        System.out.println("School name: "+ name);
        if (professors == null){
            return;

        }else{
            for (Professor professor : professors ) {
                System.out.println("Professor´s name: "+ professor.getName());
            }
        }
        System.out.println("-------------------------");
    }
}
