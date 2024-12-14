package advancedconcepts.day34.polymorphism;

public class MainApp {

    public static void main(String[] args) {

        /*
        Polimorfizm (Çok biçimlilik):
        abstract class: Soyut sınıflar kendisinden türeyen alt sınıflara
        ne yapmaları gerektiğini söyler ama nasıl yapmaları gerektiğini söylemez.
        Kendilerine bırakır.
         */

        Kare kare = new Kare(9);
        System.out.println("Karenin Alanı = " + kare.alanHesapla());
        System.out.println("Karenin Çevresi = " + kare.cevreHesapla());


    }


}
