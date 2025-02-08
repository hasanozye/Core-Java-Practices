package advancedconcepts.day37Interface;

public class Kartal extends Hayvan implements Ucucu, Avci {

    @Override
    public void uc() {
        System.out.println("Kartal Uçuyor.");
    }

    @Override
    public void avlan() {
        System.out.println("Kartal avlanıyor.");
    }

}
