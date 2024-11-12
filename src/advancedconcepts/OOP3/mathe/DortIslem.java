package advancedconcepts.OOP3.mathe;

public class DortIslem {
    public int sayi1;
    public int sayi2;

    public DortIslem(int sayi1, int sayi2) {
        this.sayi1 = sayi1;
        this.sayi2 = sayi2;
    }

    public int topla() {
        return sayi1 + sayi2;
    }

    public int carp() {
        return sayi2 * sayi1;
    }


}
