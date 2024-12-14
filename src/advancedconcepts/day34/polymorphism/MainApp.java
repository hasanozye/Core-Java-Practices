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
        System.out.println();

        Sekil sekil = new Daire(7);
        Sekil[] sekiller = new Sekil[4];
        sekiller[0] = new Daire(5);
        sekiller[1] = new Kare(6);
        sekiller[2] = new Dikdortgen(8, 12);
        sekiller[3] = new Sekil() {
            @Override
            protected double alanHesapla() {
                return 100;
            }

            @Override
            protected double cevreHesapla() {
                return 50;
            }
        };

        for (Sekil s : sekiller) {
            System.out.println("Alan : " + s.alanHesapla());
            System.out.println("Çevre : " + s.cevreHesapla());
            System.out.println();
        }


    }


}
