package learning.java.begin;
import java.util.Scanner;

public class Ex008MatrixPt02 {
    public static void main(String[] args){

        int columnA = 0;
        int lineA = 0;
        int columnB = 0;
        int lineB = 0;
        Scanner read = new Scanner(System.in);

        // Header

        System.out.println("Hello, world.");
        System.out.println("Multiplicação de Matrizes");
        System.out.println("------------------------");

        // Input matrix A

        System.out.println("Informe o Número de linhas da Matriz A: ");
        lineA = read.nextInt();
        System.out.println("Informe o Número de Colunas da Matriz A: ");
        columnA = read.nextInt();

        // Input matrix B

        System.out.println("Informe o Número de linhas da Matriz B: ");
        lineB = read.nextInt();
        System.out.println("Informe o Número de Colunas da Matriz B: ");
        columnB = read.nextInt();

        int[][] matrixA = new int[lineA][columnA];

        for (int i=0; i < matrixA.length; i++){
            for (int j = 0; j < matrixA[i].length; j++ ){
                System.out.print("Matriz A posicao: "+i+","+j+": ");
                matrixA[i][j] = read.nextInt();

            }
        }

        int[][] matrixB = new int[lineB][columnB];

        for (int i=0; i < matrixB.length; i++){
            for (int j = 0; j < matrixB[i].length; j++ ){
                System.out.print("Matriz B posicao: "+i+","+j+": ");
                matrixB[i][j] = read.nextInt();

            }
        }

        // Output

        System.out.println("\n---------------------------\nMatriz A");

        for (int i=0; i < matrixA.length; i++){
            System.out.println("\n");
            for (int j = 0; j < matrixA[i].length; j++ ){
                System.out.print("   "+matrixA[i][j]+"   ");

            }
        }

        System.out.println("\n---------------------------\nMatriz B");

        for (int i=0; i < matrixB.length; i++){
            System.out.println("\n");
            for (int j = 0; j < matrixB[i].length; j++ ){
                System.out.print("   "+matrixB[i][j]+"   ");

            }
        }
        System.out.println("\nMultiplicando as Matrizes...");
        if (columnA == lineB){
            System.out.println("\n---------------------------\nMatriz C");;
            int[][] matrixC = new int[lineA][columnB];

            for (int i = 0; i < lineA; i++) {
                for (int j = 0; j < columnB; j++) {
                    int valor = 0;
                    for (int k = 0; k < columnA; k++) {
                        valor += matrixA[i][k] * matrixB[k][j];
                    }
                    matrixC[i][j] = valor;
                }
            }

            // Result Matrix C

            for (int i = 0; i < lineA; i++) {
                System.out.println("\n");
                for (int j = 0; j < columnB; j++) {
                    System.out.print("   "+matrixC[i][j]+"   ");
                }
                System.out.println();
            }

        }else{
            System.out.println("ATENÇÃO!\nNão é possível realizar a operação entre as matrizes devido à " +
                    "incompatibilidade de tamanhos ou outras limitações.");
        }

    }
}
