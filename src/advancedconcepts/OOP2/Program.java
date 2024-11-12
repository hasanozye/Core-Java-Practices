package advancedconcepts.OOP2;

import advancedconcepts.OOP2.geometrikSekiller.Kare;

public class Program {

    public static void main(String[] args) {



        Kare kare1 = new Kare();
        kare1.kenar = 7;
        //kare1.bilgiGoster();

        Kare kare2 = new Kare();
        kare2.kenar = 5;

        int toplamAlan = kare1.alanHesapla() + kare2.alanHesapla();
        int toplamCevre = kare1.cevreHesapla() + kare2.cevreHesapla();




        //DRY uygun değil
        //int alan = kare1.kenar * kare1.kenar;
        //System.out.println("alan = " + alan);


    }

}
