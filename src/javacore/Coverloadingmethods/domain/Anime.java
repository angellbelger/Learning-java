package javacore.Coverloadingmethods.domain;

public class Anime {
    private String type;
    private int episodes;
    private String name;

    public void printData(){
        System.out.println(type);
        System.out.println(name);
        System.out.println(episodes);
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

    public String getEpisodes(){
        return this.episodes;
    }

}
