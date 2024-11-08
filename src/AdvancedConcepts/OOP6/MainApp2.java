package AdvancedConcepts.OOP6;

public class MainApp2 {

    public static void main(String[] args){
        // Bir ata sınıf, kendisinden türetilmiş alt sınıf örneklerine referans olabilir
        Object object = new Hayvan();
        Hayvan hy1 = new Kedi();
        Hayvan hy2 = new Koyun();
        Hayvan hy3 = new Hayvan();
        hy1.beslen();
        hy2.beslen();
        hy3.beslen();
    }

}
