package advancedconcepts.day37Interface;

public class Hayvan {

    private String isim;
    private int yas;
    private double agirlik;


    public Hayvan(String isim, int yas, double agirlik) {
        this.isim = isim;
        this.yas = yas;
        this.agirlik = agirlik;
    }

    public Hayvan() {

    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }

    public void beslen() {
        System.out.println("Hayvan besleniyor...");
    }

    public void uyu() {
        System.out.println("Hayvan uyuyor.");
    }

    public void hareketEt(){
        System.out.println("Hayvan hareket ediyor.");
    }





}
