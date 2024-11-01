package AdvancedConcepts.OOP3.GeometrikSekiller;

public class Daire {

    int yaricap;

    public Daire(int yaricap) {
        this.yaricap = yaricap;
    }

    public static double alanHesapla(int yaricap) {
        return Math.PI * yaricap * yaricap;
    }


    public static double cevreHesapla(int yaricap) {
        return 2 * Math.PI * yaricap;
    }

}
