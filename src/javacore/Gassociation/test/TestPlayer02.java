package javacore.Gassociation.test;

import javacore.Gassociation.domain.Player;
import javacore.Gassociation.domain.Team;

public class TestPlayer02 {
    public static void main(String[] args){
        Player player01 = new Player("Kaká");

        Team team01 = new Team("Milan");
        player01.setTeam(team01);

        player01.printPlayer();
    }

}
