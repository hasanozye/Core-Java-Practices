package advancedconcepts.day34;

public class MainApp {

    public static void main(String[] args) {

        //Jagged diziler elaman sayıları farklı olan dizilerin dizisidir.
        //int[][] notlar = new int[5][3]; matris
        /*String[][] zaman = new String[3][];

        //haftanın günleri
        zaman[0] = new String[7];
        zaman[0][0] = "Pazartesi";
        zaman[0][1] = "Salı";

        //yılın ayları
        zaman[1] = new String[12];
        zaman[1][0] = "Ocak";

        //mevsimler
        zaman[2] = new String[4];
        zaman[2][0] = "İlkbahar";*/

        String[][] zaman = {
                {"Pzt", "Sal", "Çar", "Per", "Cum", "Cts", "Pzr"},
                {"Oca", "Şub", "Mar", "Nis", "May", "Haz", "Tem", "Ağu", "Eyl", "Eki", "Kas", "Ara"},
                {"İlk", "Yaz", "Son", "Kış"}
        };

        System.out.println(zaman.length);
        System.out.println("İlk Eleman : " + zaman[0].length);
        System.out.println("İkinci Eleman : " + zaman[1].length);
        System.out.println("Üçüncü Eleman : " + zaman[2].length);

        int toplamElemanSayisi = 0;
        for (int i = 0; i < zaman.length; i++) {
            toplamElemanSayisi += zaman[i].length;
        }
        System.out.println("Toplam Eleman Sayısı : " + toplamElemanSayisi);
        System.out.println("-".repeat(55));
        for (int i = 0; i < zaman.length; i++) {
            for (int j = 0; j < zaman[i].length; j++) {
                System.out.print(zaman[i][j] + "\t");
            }
            System.out.println();
        }


    }

}
