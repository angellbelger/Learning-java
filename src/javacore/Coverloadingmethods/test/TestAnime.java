package javacore.Coverloadingmethods.test;

import javacore.Coverloadingmethods.domain.Anime;

public class TestAnime {
    public static void main(String[] args){
        Anime anime = new Anime();
        /*
        anime.setType("Mangá");
        anime.setEpisodes(24);
        anime.setName("Sakamoto Desu Ga");
         */
        anime.init("Mangá 2", 12, "Sakamoto Desu Ga 2", "action");
        anime.printData();
    }
}
