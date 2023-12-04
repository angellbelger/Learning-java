package javacore.Gassociation.domain;

public class Player {
    private String name;
    private Team team;

    public Player(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(Team team){
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }

    public void printPlayer(){
        System.out.println("Name: "+ this.name);
        if (team != null){
            System.out.println("Team: "+ team.getName());
        }
    }

}
