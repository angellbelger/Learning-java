package javacore.Coverloadingmethods.domain;

public class Anime {
    private String type;
    private int episodes;
    private String name;
    private String genre;

    public void init(String type, int episodes, String name){
        this.type = type;
        this.episodes = episodes;
        this.name = name;
    }

    public void init(String type, int episodes, String name, String genre){
        this.init(type, episodes, name);
        this.genre = genre;
    }

    public void printData(){
        System.out.println(type);
        System.out.println(name);
        System.out.println(episodes);
        System.out.println(genre);
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public void setEpisodes(int episodes){
        this.episodes = episodes;
    }

    public int getEpisodes(){
        return this.episodes;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getGenre(){
        return this.genre;
    }

}
