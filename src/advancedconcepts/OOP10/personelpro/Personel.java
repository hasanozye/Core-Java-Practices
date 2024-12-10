package advancedconcepts.OOP10.personelpro;

public class Personel {

    private int sicilNo;
    private String adi;
    private String soyadi;
    private double maasi;
    private long iseGirisYili;

    public Personel() {

    }

    public Personel(int sicilNo, String adi, String soyadi, float maasi, int iseGirisYili) {
        this.sicilNo = sicilNo;
        this.adi = adi;
        this.soyadi = soyadi;
        this.maasi = maasi;
        this.iseGirisYili = iseGirisYili;
    }


    public int getSicilNo123() {
        return sicilNo;
    }

    public void setSicilNo123(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public double getMaasi() {
        return maasi;
    }

    public void setMaasi(double maasi) {
        this.maasi = maasi;
    }

    public long getIseGirisYili() {
        return iseGirisYili;
    }

    public void setIseGirisYili(int iseGirisYili) {
        this.iseGirisYili = iseGirisYili;
    }

    public void iseBasla() {
        System.out.println("Personel işe başladı");
    }

    public void molaVer() {
        System.out.println("Personel mola verdi. ALL REPORTS BRANCH EKLENDİ. OLDU ÖYLE ŞEYLER");
    }

    public void paydosYap() {
        System.out.println("Personel paydos yaptı");
    }

    public void gorevYap(){
        System.out.println("Personel Görevini yapıyor.");
    }

    public static boolean maasaZamYap(Personel personel, int zamOrani) {
        if (personel == null || zamOrani <= 0) {
            return false;
        }
        // "||" , "&&" shortcircut, yani kısayol. Burda ik itane kullanılmasının sebebi, ikinciye bakmıyor direkt geçiyor.
        // bazen array'in null olmadığını veya lengrhini kontrol ederken mesela 2.nin hata vermemesi için yapılıyor sık sık.
        double mevcutMaas = personel.getMaasi();
        personel.setMaasi((mevcutMaas + (mevcutMaas * zamOrani / 100)));
        return true;
    }


}
