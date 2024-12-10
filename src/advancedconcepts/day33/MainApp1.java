package advancedconcepts.day33;

import java.util.Arrays;

public class MainApp1 {

    public static void main(String[] args) {

        int[] sayilar = {1, 3, 5, 7};

        System.out.println(Arrays.toString(sayilar));


        int[] tmp = new int[sayilar.length];

        for (int i = 0; i < sayilar.length; i++) {
            tmp[i] = sayilar[i];
        }

        sayilar = new int[sayilar.length + 1];

        for (int i = 0; i < tmp.length; i++) {
            sayilar[i] = tmp[i];
        }
        sayilar[sayilar.length - 1] = 9;

        System.out.println(Arrays.toString(sayilar));


    }

}
