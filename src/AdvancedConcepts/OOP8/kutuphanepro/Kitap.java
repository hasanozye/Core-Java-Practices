package AdvancedConcepts.OOP8.kutuphanepro;

public class Kitap {

    private  String adi;
    private String yazari;
    private int sayfaAdedi;

    public Kitap(){

    }


    public Kitap(String adi, String yazari, int sayfaAdedi) {
        this.adi = adi;
        this.yazari = yazari;
        this.sayfaAdedi = sayfaAdedi;
    }

    @Override
    public String toString() {
        return String.format("%s (%s : %d) ", adi, yazari, sayfaAdedi);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getYazari() {
        return yazari;
    }

    public void setYazari(String yazari) {
        this.yazari = yazari;
    }

    public int getSayfaAdedi() {
        return sayfaAdedi;
    }

    public void setSayfaAdedi(int sayfaAdedi){
        if (sayfaAdedi>0){
            this.sayfaAdedi = sayfaAdedi;
        }else {
            System.err.println("Sayfa aded negatif olamaz");
        }
    }


}
