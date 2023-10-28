package learning.java.begin;

public class Ex008Matrix {
    public static void main(String[] args){
        System.out.println("Hello, world.");
        System.out.println("----------------------------");

        int[][] matrix = new int[3][3];

        for (int i=0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++ ){
                System.out.print("   "+matrix[i][j]+"   ");

                if (j > 0 && j % 2 == 0){
                    System.out.println("\n");
                }
            }
        }
        System.out.println();


    }
}
