package advancedconcepts.day33;

import java.util.Arrays;

public class MainApp3 {

    public static void main(String[] args){
        Gezgin gezgin = new Gezgin();
        System.out.println(gezgin.addYol(10));
        System.out.println(Arrays.toString(gezgin.getYolListesi()));

        System.out.println(gezgin.addYol(20));
        System.out.println(Arrays.toString(gezgin.getYolListesi()));

        System.out.println(gezgin.addYol(70));
        System.out.println(Arrays.toString(gezgin.getYolListesi()));
    }

}
