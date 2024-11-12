package advancedconcepts.OOP9.kutular;

public class Kutu {

    private int genislik;
    private int derinlik;
    private int yukseklik;

    public Kutu() {
        this(1, 1, 1);
    }

    public Kutu(int genislik, int derinlik, int yukseklik) {
        this.genislik = genislik;
        this.derinlik = derinlik;
        this.yukseklik = yukseklik;
    }


    public int getGenislik() {
        return genislik;
    }

    public void setGenislik(int genislik) {
        if (genislik < 1) return;
        this.genislik = genislik;
    }

    public int getDerinlik() {
        return derinlik;
    }

    public void setDerinlik(int derinlik) {
        this.derinlik = derinlik;
    }

    public int getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(int yukseklik) {
        this.yukseklik = yukseklik;
    }

    public int getHacim() {
        return genislik * yukseklik * derinlik;
    }

    @Override
    public String toString() {
        return String.format("Kutu : [%d x %d x %d ]", genislik, derinlik, yukseklik);
    }


}
