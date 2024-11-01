package AdvancedConcepts.OOP3.GeometrikSekiller;

public class Kare {

    int kenar;

    public Kare(int kenar) {
        this.kenar = kenar;
    }

    public static int alanHesapla(int kenar) {
        return kenar * kenar;
    }

    public static int cevreHesapla(int kenar) {
        return 4 * kenar;
    }

    public static double kosegenUzunlugu(int kenar) {
        return kenar * Math.sqrt(2);
    }


}
