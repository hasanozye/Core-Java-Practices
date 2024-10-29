package AdvancedConcepts.OOP2.hayvanlar;

public class MainApp {

    public static void main(String[] args) {
        Kedi boncuk = new Kedi("Van Kedisi", 2, 2.3);
        boncuk.cinsi = "Van Kedisi";
        boncuk.yasi = 2;
        boncuk.agirligi = 2.3;

        Aslan aslan = new Aslan();
        aslan.boy = 30;
        aslan.cins = "ĞIAAARRVVVV";
        aslan.kilo = 2896;
        aslan.renk = "Sarımtırak";

    }

}
