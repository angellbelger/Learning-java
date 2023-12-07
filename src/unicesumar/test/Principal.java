package unicesumar.test;

class Automovel{
    public void andar(){
        System.out.println("Automóvel se movimenta. ");
    }
    public void correr(){
        System.out.println("Automóvel corre. ");
    }
}

class Carro extends Automovel{
    public void correr(){
        System.out.println("Carro corre.");
    }
}

public class Principal{
    public static void main(String[] args){
        Automovel auto = new Carro();
        auto.andar();
        auto.correr();
    }
}