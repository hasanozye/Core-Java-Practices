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


    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
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

    public void setMaasi(float maasi) {
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

    public static void maasaZamYap(Personel personel, int zamOrani) {
        if (personel != null || zamOrani <= 0) return;
        double mevcutMaas = personel.getMaasi();
        personel.setMaasi((float) (mevcutMaas + (mevcutMaas * zamOrani/100)));
    }


}
