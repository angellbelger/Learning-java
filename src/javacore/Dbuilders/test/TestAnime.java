package javacore.Dbuilders.test;

import javacore.Dbuilders.domain.Anime;

public class TestAnime {
    public static void main(String[] args){
        Anime anime = new Anime("mangá", 12, "Sakamoto Desu Ga", "action", "tv tokyo");
        anime.printData();
    }
}
