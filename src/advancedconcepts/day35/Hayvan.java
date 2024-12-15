package advancedconcepts.day35;

public class Hayvan {
    private double agirlik;
    private String isim;

    public Hayvan(){

    }

    public Hayvan(double agirlik, String isim) {
        this.agirlik = agirlik;
        this.isim = isim;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void beslen(){
    }

}
