package AdvancedConcepts.OOP3.GeometrikSekiller;

public class MainApp {

    public static void main(String[] args) {

        int kareCevreHesapla = Kare.cevreHesapla(7);
        int kareAlanHesapla = Kare.alanHesapla(7);

        double daireAlanHesapla = Daire.alanHesapla(7);
        double daireCevreHesapla = Daire.cevreHesapla(7);

        int kareAlanCevreMutlakDegeri = Math.abs(kareAlanHesapla - kareCevreHesapla);
        System.out.println("kareAlanCevreMutlakDegeri = " + kareAlanCevreMutlakDegeri);

        double daireAlanCevreMutlakDegeri = Math.abs(daireAlanHesapla - daireCevreHesapla);
        System.out.printf("daireAlanCevreMutlakDegeri = %.2f",daireAlanCevreMutlakDegeri);

    }

}
