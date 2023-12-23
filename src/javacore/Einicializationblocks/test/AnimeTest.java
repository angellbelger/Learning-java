package javacore.Einicializationblocks.test;

import javacore.Einicializationblocks.domain.Anime;

public class AnimeTest {
    public static void main(String [] args){
        Anime anime = new Anime("Sakamoto");


        System.out.println("Anime: "+anime.getName());
        for (int episode: anime.getEpisodes()){
            System.out.println("Episode number: "+episode);
        }

    }
}
