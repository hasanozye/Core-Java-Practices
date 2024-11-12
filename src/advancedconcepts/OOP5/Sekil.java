package advancedconcepts.OOP5;

public class Sekil {

    private int[] kenarlar;
    private char[] koseler;
    private String renk;

    public int[] getKenarlar() {
        return kenarlar;
    }

    public void setKenarlar(int[] kenarlar) {
        this.kenarlar = kenarlar;
    }

    public char[] getKoseler() {
        return koseler;
    }

    public void setKoseler(char[] koseler) {
        this.koseler = koseler;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        if (renk!= null){
            this.renk = renk;
        }
    }

    public int alanHesapla() {
        return 0;
    }

    public int cevreHesapla() {
        return 0;
    }

    public int getIcAcilarToplami() {
        return 0;
    }


}
