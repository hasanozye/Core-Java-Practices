package advancedconcepts.OOP9;

public class MainApp {

    public static void main(String[] args) {

        Uye uye = new Uye();
        Kitap k1 = new Kitap("Sefiller", "Victor Hugo", 500);
        Kitap k2 = new Kitap("Kaşağı", "Ö. Setfettin", 300);
        uye.kitapAl(k1);

    }

}
