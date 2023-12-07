package javacore.Einicializationblocks.test;

import javacore.Einicializationblocks.domain.Anime;

public class AnimeTest {
    public static void main(String [] args){
        Anime anime = new Anime("Sakamoto");

        for (int episode: anime.getEpisodes()){
            System.out.println("Episode number: "+episode);
        }

    }
}
