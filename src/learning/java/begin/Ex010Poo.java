package learning.java.begin;

public class Ex010Poo {
    public static void main(String[] args){
        class Veiculo {

            public String marca;

            public void locomover () {

                System.out.println("O veículo está se locomovendo");

            }

        }

        class Trem extends Veiculo {

            public void locomover () {

                System.out.println("O Trem está se locomovendo sob os trilhos");

            }

        }
    }
}
