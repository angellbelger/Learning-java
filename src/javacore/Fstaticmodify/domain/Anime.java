package javacore.Fstaticmodify.domain;

public class Anime {
    private String name;
    private static int[] episodes;

    // Ordem dos blocos até o momento
    // 0 - Bloco de inicialização estático é executado quando a JVM carregar a classe
    // 1 - Alocação em memória para o objeto
    // 2 - Cada atributo da classe é criado e recebe o valor default, caso nenhum outro seja especificado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    // Bloco de inicialização de instância
    static {
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++){
            episodes[i] = i + 1;
        }
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }
    static {
        System.out.println("Dentro do bloco de inicialização estático");

    }

    // Construtor com um parâmetro
    public Anime(String name){
        this.name = name;
    }

    // Construtor sem padrão
    public Anime(){

        for (int i = 0; i < Anime.episodes.length; i++){
            System.out.println("Episode number: "+ Anime.episodes[i]);
        }
        System.out.println();
    }

    public String getName(){
        return name;

    }

    public int[] getEpisodes(){
        return episodes;
    }
}
