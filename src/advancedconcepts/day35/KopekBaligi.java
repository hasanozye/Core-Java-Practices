package advancedconcepts.day35;

public class KopekBaligi extends Hayvan implements Avci,Yuzucu {

    @Override
    public void avlan() {
        System.out.println("Köpekbalığı avlanıyor.");
    }

    @Override
    public void yuz(){
        System.out.println("Kopekbalığı yuzuyor");
    }

}
