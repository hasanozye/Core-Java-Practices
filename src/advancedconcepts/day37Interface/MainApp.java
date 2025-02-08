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
        /*Hayvan hayvan1 = new Hayvan("Hayvan 1", 5, 12.0);
        hayvan1.beslen();

        Aslan aslan1 = new Aslan();
        aslan1.yuz();

        Kaplan kaplan1 = new Kaplan();

        Balina balina1 = new Balina();
        balina1.yuz();

        Yuzucu yuzucu1 = new Aslan();
        Yuzucu yuzucu2 = new Balina();

        //Unboxing Boxing
        Hayvan hayvan2 = new Kaplan();
        ((Kaplan)hayvan2).avlan();

        Yuzucu yuzucu3 = new Balina();*/

        Yuzucu[] yuzuculer = new Yuzucu[3];
        yuzuculer[0] = new Balina();
        yuzuculer[1] = new Aslan();
        yuzuculer[2] = new Balina();

        for(Yuzucu yuzucu : yuzuculer){
            yuzucu.yuz();
        }




    }


}
