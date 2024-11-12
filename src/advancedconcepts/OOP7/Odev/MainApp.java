package advancedconcepts.OOP7.Odev;

public class MainApp {

    public static void main(String[] args) {
        Araba araba = new Araba();
        YarisArabasi yarisArabasi1 = new YarisArabasi();
        Araba araba2= new YarisArabasi();

        araba.ilerle();
        yarisArabasi1.ilerle();
        araba2.ilerle();
        yarisArabasi1.turbo();
        ((YarisArabasi)araba2).turbo();

    }

}
