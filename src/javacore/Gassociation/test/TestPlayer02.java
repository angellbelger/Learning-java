package javacore.Gassociation.test;

import javacore.Gassociation.domain.Player;
import javacore.Gassociation.domain.Team;

public class TestPlayer02 {
    public static void main(String[] args){
        Player player01 = new Player("Kaká");
        Player player02 = new Player("Bellinhan");

        Team team01 = new Team("Milan");
        Team team02 = new Team("Real Madrid");
        player01.setTeam(team01);
        player02.setTeam(team02);

        player01.printPlayer();
        System.out.println("------------------------");
        player02.printPlayer();
    }

}
