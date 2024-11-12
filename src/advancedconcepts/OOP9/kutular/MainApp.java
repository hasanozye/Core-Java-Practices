package advancedconcepts.OOP9.kutular;

public class MainApp {

    public static void main(String[] args){
        Kutu kutu1 = new Kutu();
        System.out.println(kutu1);
        int hacim = kutu1.getHacim();
        System.out.println("hacim = " + hacim);
    }

}
