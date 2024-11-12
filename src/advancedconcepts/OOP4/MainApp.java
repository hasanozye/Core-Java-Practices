package advancedconcepts.OOP4;

public class MainApp {

    public static void main(String[] args) {

        /*
        OOP- Nesneye dayalı programlama
        Amaç: Gerçek hayat nesnelerini soyutlayıp(abstraction), sınıf tasarımlarını yapmak.
        Yani gerçek hayat nesnelerinin özellik ve davranışlarının simüle edilmesi işlemidir.


        Nesneye Dayalı Programlama Prensipleri
        1. Kalıtım (Inheritance)
        2. Sarmalama, paketleme ( Encapslation)
        3. Çok biçimlilik (polymorphism)
         */


        Hayvan hy1 = new Hayvan();
        //JFrame form = new JFrame("Hayvanat bahçesi yönetim programı");
        //form.setSize(800, 600);
        //form.setVisible(true);

        //hy1.isim = "Hayvan 1";
        hy1.ismiKaydet("Hayvan 1");
        //hy1.yas = 3;
        hy1.yasiKaydet(5);
        //hy1.agirlik = 12;
        hy1.agirligiKaydet(12);

        System.out.printf("%s %d - %.2f\n", hy1.ismiGetir(), hy1.yasiGetir(), hy1.agirligiGetir());

        hy1.beslen();
        hy1.uyu();

        Aslan a1 = new Aslan();


    }

}
