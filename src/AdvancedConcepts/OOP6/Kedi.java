package AdvancedConcepts.OOP6;

public class Kedi extends Hayvan {

    public Kedi() {
        //System.out.println("Kedi nesnesi oluşturuldu.");
    }

    public void avlan() {
        System.out.println("Kedi avlanıyor.");
    }

    @Override
    public void beslen() {
        System.out.println("Kedi caiz et ile besleniyorr");
    }

}
