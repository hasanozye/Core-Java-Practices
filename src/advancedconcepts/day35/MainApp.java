package advancedconcepts.day35;

public class MainApp {

    public static void main(String[] args) {
        //interface
        /*
        1. Java'da çoklu kalıtım yoktur. Yani bir sınıf sadece bir sınıftan extend edilebilir.
        2. Bir interface kendisini implemente edecek alt sınıflara ne yapacaklarını söyler ama
        nasıl yapacaklarına karışmaz.
         */

        Kartal k1 = new Kartal();
        Ucucu ucucu1 = new Kirlangic();
        Avci avci1 = new KopekBaligi();

        Ucucu[] ucanlar = new Ucucu[3];
        ucanlar[0] = new Kirlangic();
        ucanlar[1] = new Kartal();
        ucanlar[2] = new Kirlangic();
        for (Ucucu u : ucanlar) {
            u.uc();
        }

        String[] gunler = {"Pzt", "Sal", "Çar", "Per", "Cum", "Cts", "Paz"};
        for (String gun : gunler) {
            System.out.println(gun);
        }

    }

}
