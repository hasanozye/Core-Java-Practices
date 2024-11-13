package advancedconcepts.OOP9.kutular;

public class MainApp {

    public static void main(String[] args){
        Kutu kutu1 = new Kutu();
        System.out.println(kutu1);
        int hacim = kutu1.getHacim();
        System.out.println("hacim = " + hacim);

        Kutu kutu2 = new Kutu(5,3,4);
        System.out.println(kutu2);

        RenkliKutu rk1  = new RenkliKutu();
        rk1.setRenk("Kırmızıı");
        rk1.setGenislik(12);
        System.out.println(rk1);

        System.out.println("Renklı Kutunun Hacmi = "+rk1.getHacim());


    }

}
