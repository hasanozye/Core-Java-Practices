package advancedconcepts.OOP3.GeometrikSekiller;

public class MainApp {

    public static void main(String[] args) {

        Kare k1 = new Kare(7);
        Daire d1 = new Daire(7);

        int kareCevreHesapla = k1.cevreHesapla();
        int kareAlanHesapla = k1.alanHesapla();

        double daireAlanHesapla = d1.alanHesapla();
        double daireCevreHesapla = d1.cevreHesapla();

        int kareAlanCevreMutlakDegeri = Math.abs(kareAlanHesapla - kareCevreHesapla);
        System.out.println("kareAlanCevreMutlakDegeri = " + kareAlanCevreMutlakDegeri);

        double daireAlanCevreMutlakDegeri = Math.abs(daireAlanHesapla - daireCevreHesapla);
        System.out.printf("daireAlanCevreMutlakDegeri = %.2f", daireAlanCevreMutlakDegeri);

    }

}
