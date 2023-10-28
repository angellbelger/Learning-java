package learning.java.begin;

public class Ex007Arrays {
    public static void main(String[] args){
        int[] list = new int[3];

        list[0] = 10;
        list[1] = 7;
        list[2] = 17;

        for (int i = 0; i < list.length; i++){
            System.out.println("Key:"+i+" Value: "+list[i]);
        }
    }
}
