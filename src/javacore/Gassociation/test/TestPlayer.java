package javacore.Gassociation.test;

import javacore.Gassociation.domain.Player;

public class TestPlayer {
    public static void main(String[] args){
        Player player1 = new Player("Kaká");
        Player player2 = new Player("De Bruyne");
        Player player3 = new Player("Bellinhan");
        Player[] players = new Player[]{player1, player2, player3};

        for (Player player : players){
            player.printPlayer();
        }

    }
}
