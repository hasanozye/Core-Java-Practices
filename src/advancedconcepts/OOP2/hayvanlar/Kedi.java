package advancedconcepts.OOP2.hayvanlar;

public class Kedi {

    public String cinsi;
    public int yasi;
    public double agirligi;

    /*
    Constructor, Bir nesneyi, "initalize" eden, yani nesnenin üyelerini başlatan, Heap'te; nesne üyeleri tanımlanmış
    tüm (instance) örnek üyeleri, değişkenleri, tek tek initalize eden methottur.

    Bu özel methodu da ancak "new" operatörü ile çağırabiliyoruz. bu operatörde gidip Heap'te oluşturuyor bu nesneleri.

     */

    public Kedi(String c, int y, double a) {
        cinsi = c;
        yasi = y;
        agirligi = a;
    }


}
