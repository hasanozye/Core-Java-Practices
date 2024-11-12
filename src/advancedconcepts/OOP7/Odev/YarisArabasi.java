package advancedconcepts.OOP7.Odev;

public class YarisArabasi extends Araba{

    public YarisArabasi(){

    }

    public void turbo(){
        System.out.println("Yarış arabası turbo ile uçuyor.");
    }
    @Override
    public void ilerle(){
        System.out.println("Yarış arabası hızla ilerliyor.");
    }


}
