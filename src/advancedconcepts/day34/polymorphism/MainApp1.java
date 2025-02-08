package advancedconcepts.day34.polymorphism;

public class MainApp1 {

    public static void main(String[] args) {
        Kare k = new Kare(15);
        sekilInfo(k);

        Daire d = new Daire(11);
        sekilInfo(d);

        Dikdortgen dikdortgen = new Dikdortgen(7, 17);
        sekilInfo(dikdortgen);

        Kare k2 = null;

        sekilInfo(k2);

    }

    public static void sekilInfo(Sekil sekil) {
        System.out.println("-".repeat(30));
        System.out.printf("Alan = %.2f - Çevre = %.2f\n", sekil.alanHesapla(), sekil.cevreHesapla());
    }


    /*public static void sekilInfo(Kare kare) {
        System.out.println("-".repeat(30));
        System.out.printf("Alan = %.2f - Çevre = %.2f\n", kare.alanHesapla(), kare.cevreHesapla());
    }

    public static void sekilInfo(Daire daire) {
        System.out.println("-".repeat(30));
        System.out.printf("Alan = %.2f - Çevre = %.2f\n", daire.alanHesapla(), daire.cevreHesapla());
    }

    public static void sekilInfo(Dikdortgen dikdortgen) {
        System.out.println("-".repeat(30));
        System.out.printf("Alan = %.2f - Çevre = %.2f\n", daire.alanHesapla(), daire.cevreHesapla());
    }*/
}
