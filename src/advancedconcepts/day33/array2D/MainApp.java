package advancedconcepts.day33.array2D;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {
        int[] vizeNotlari = {81, 56, 92, 38, 53};
        int[] finalNotlari = {95, 54, 74, 93, 69};
        //int[][] notlar = new int[5][2];
        /*notlar[0][0] = 81;
        notlar[0][1] = 95;
        notlar[1][0] = 56;
        notlar[1][1] = 54;*/

        int[][] notlar = {
                {81, 95},
                {56, 54},
                {92, 74},
                {38, 93},
                {53, 69},

        };

        String[] isimler = {"Ahmet", "Ayşe", "Şengül", "Orhan", "Betül"};

        //System.out.println("Notlar length: " + notlar.length);

        System.out.println("İsim\tViz\tFin");
        for (int i = 0; i < notlar.length; i++) {
            System.out.print(isimler[i] + "\t");
            for (int j = 0; j < notlar[i].length; j++) {
                System.out.print(notlar[i][j] + "\t");
            }
            System.out.println();

        }
    }

}
