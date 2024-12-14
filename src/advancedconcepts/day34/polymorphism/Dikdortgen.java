package advancedconcepts.day34.polymorphism;

public class Dikdortgen extends Sekil {

    private double kisaKenar;
    private double uzunKenar;

    public Dikdortgen() {

    }

    public Dikdortgen(double kisaKenar, double uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    @Override
    protected double alanHesapla() {
        return kisaKenar * uzunKenar;
    }

    @Override
    protected double cevreHesapla() {
        return 2 * (kisaKenar + uzunKenar);
    }


}
