package advancedconcepts.day33.array2D;

import java.util.Arrays;

public class MainApp2 {

    public static void main(String[] args) {
        //2d arrays
        int[][] sayilar = new int[5][];
        System.out.println(Arrays.toString(sayilar[1])); //null
        sayilar[0] = new int[2];
        sayilar[1] = new int[2];
        sayilar[2] = new int[2];
        sayilar[3] = new int[2];
        sayilar[4] = new int[2];
        System.out.println(Arrays.toString(sayilar[1])); // değer oluştu.
        sayilar[1][0] = 56;
        int x = sayilar[1][0];
        System.out.println(x);
    }

}
