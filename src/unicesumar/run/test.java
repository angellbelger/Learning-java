package unicesumar.run;

public class test{
    public static void main(String[] args){
        int pontos = 1000;
        if (pontos == 0)
            System.out.println("Você agora tem 0 pontos.");
        else if( pontos > 0 && pontos <= 1000) {
            System.out.println("Você está no nível básico");
        } else if( pontos > 1000 && pontos <=10000){
            System.out.println("Você está no nível intermediário.");
        } else System.out.println("Parabéns, você chegou ao nível avançado.");
    }
}