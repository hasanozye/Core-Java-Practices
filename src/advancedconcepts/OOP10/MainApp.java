package advancedconcepts.OOP10;

import advancedconcepts.OOP10.personelpro.Personel;

public class MainApp {

    public static void main(String[] args) {
        Personel per1 = new Personel();
        int sicilNo = per1.getSicilNo123();
        per1.setSicilNo123(5);
        per1.setAdi("hakan");
        per1.setSoyadi("ilhami");
        per1.setSicilNo123(1);
        per1.setIseGirisYili(1990);
        per1.setMaasi(5000);

        per1.iseBasla();
        System.out.println("-----------------------");
        per1.molaVer();
        System.out.println("-----------------------");
        per1.paydosYap();

        if (Personel.maasaZamYap(per1, -10)) {
            System.out.println("Zam Yapıldı");
        } else {
            System.out.println("Zam yapılamadı");
        }

        System.out.println("Maaş : " + per1.getMaasi());
        per1 = null;
        if (!Personel.maasaZamYap(per1, 10)) {
            System.out.println("Başarısız");
        }

    }


}
