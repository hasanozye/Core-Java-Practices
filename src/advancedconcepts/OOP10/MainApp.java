package advancedconcepts.OOP10;

import advancedconcepts.OOP10.personelpro.Personel;

public class MainApp {

    public static void main(String[] args) {
        Personel per1 = new Personel();
        int sicilNo = per1.getSicilNo();
        per1.setSicilNo(5);
        per1.setAdi("hakan");
        per1.setSoyadi("ilhami");
        per1.setSicilNo(1);
        per1.setIseGirisYili(1990);
        per1.setMaasi(2000.3F);

        per1.iseBasla();
        System.out.println("-----------------------");
        per1.molaVer();
        System.out.println("-----------------------");
        per1.paydosYap();





    }


}
