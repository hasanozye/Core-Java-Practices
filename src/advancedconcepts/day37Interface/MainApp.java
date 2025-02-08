package advancedconcepts.day37Interface;

public class MainApp {

    /*
    Soyut Sınıflar: Örnekleri oluşturlamaz.
    Kalıtım yoluyla (extends) alt sınıf oluşturulabilir.
    İçerisinde gövdeli ve gövdesiz metotlar bulunabilir.
    Gövdesiz metotlar, alt sınıda ne yapması gerektiğini söyler,
    ama nasıl yapması gerektiğini söylemez.
     */

    /*
    Interface: Çok biçimliliği sağlamak için kullanılan sınıf benzeri yapılardır.
    Gövdeli metotları bulunmaz. Yani bütün metotları abstarct'tır.
    Kendisini implemente (uygulayacak, gerçekleştirecek) edecek alt sınıflara
    ne yapacaklarını bildiriyor ama nasıl yapacaklarına karışmıyor.
     */

    public static void main(String[] args) {
        Hayvan hayvan1 = new Hayvan("Hayvan 1", 5, 12.0);
        hayvan1.beslen();

        Aslan aslan1 = new Aslan();
        aslan1.avlan();

        Kaplan kaplan1 = new Kaplan();
        kaplan1.avlan();

    }


}
