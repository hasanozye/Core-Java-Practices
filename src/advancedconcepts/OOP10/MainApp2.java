package advancedconcepts.OOP10;

import advancedconcepts.OOP10.personelpro.Mudur;
import advancedconcepts.OOP10.personelpro.Personel;

public class MainApp2 {

    public static void main(String[] args) {
        Mudur md1 = new Mudur();
        md1.gorevYap();
        md1.molaVer();
        md1.setMaasi(10000);
        Personel.maasaZamYap(md1, 10);

        //Bir ata sınıf (Personel), kendisinden türemiş(extends)
        // alt sınıf (Mudur) örneklerine (nesnelerine, objects) referans olabilir
        Personel p = new Mudur();
        p.gorevYap();
        // Heap'te hangi nesne var?

    }

}
