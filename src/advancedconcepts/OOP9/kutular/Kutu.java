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
        if (genislik > 0) {
            this.genislik = genislik;
        } else {
            this.genislik = 1;
        }
    }

    public int getDerinlik() {
        return derinlik;
    }

    public void setDerinlik(int derinlik) {
        if (derinlik > 0) {
            this.derinlik = derinlik;
        } else {
            this.derinlik = 1;
        }
    }

    public int getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(int yukseklik) {
        if (yukseklik > 0){
            this.yukseklik = yukseklik;
        }else {
         this.yukseklik = 1;
        }
    }

    public int getHacim() {
        return genislik * yukseklik * derinlik;
    }

    @Override
    public String toString() {
        return String.format("Kutu : [%d x %d x %d ]", genislik, derinlik, yukseklik);
    }


}
