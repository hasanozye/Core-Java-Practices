package advancedconcepts.OOP9.kutular;

public class RenkliKutu extends Kutu {

    private String renk;

    public RenkliKutu() {

    }

    public RenkliKutu(int genislik, int derinlik, int yukseklik, String renk) {
        super(genislik, derinlik, yukseklik);
        this.renk = renk;
    }


    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    @Override
    public String toString() {
        return String.format("Renklı Kutu : [ %s %d x %d x %d ]",
                renk, getGenislik(), getDerinlik(), getYukseklik());
    }


}
