package AdvancedConcepts.OOP3.GeometrikSekiller;

public class Daire {

    /*
    Sırayla:
    1-) Önce değişkenler
    2-) Sonra Constructor'lar
    3-) Sonra Getter Setter'lar
    4-) Sonra diğer metodlar.
     */

    public int yaricap;

    public Daire(int yaricap) {
        this.yaricap = yaricap;
    }

    public double alanHesapla() {
        return Math.PI * Math.pow(yaricap, 2);
    }


    public double cevreHesapla() {
        return 2 * Math.PI * yaricap;
    }

}
