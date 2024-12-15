package advancedconcepts.day35;

public class Kartal extends Hayvan implements Avci, Yuzucu, Ucucu {

    @Override
    public void avlan() {
        System.out.println("Kartal avlanıyor.");
    }

    @Override
    public void yuz() {
        System.out.println("Kartal yuzuyor");
    }

    @Override
    public void uc(){
        System.out.println("Kartal ucuyor");
    }

}
