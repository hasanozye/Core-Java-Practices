package advancedconcepts.OOP5;

public class Kare extends Sekil {

    @Override
    public int alanHesapla() {
        return getKenarlar()[0] * getKenarlar()[0];
    }

    @Override
    public int cevreHesapla() {
        return super.cevreHesapla();
    }

    @Override
    public int getIcAcilarToplami() {
        return super.getIcAcilarToplami();
    }
}
