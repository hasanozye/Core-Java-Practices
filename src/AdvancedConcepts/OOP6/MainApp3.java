package AdvancedConcepts.OOP6;

public class MainApp3 {

    public static void main(String[] args) {
        Hayvan hayvan = new Kedi();
        ((Kedi) hayvan).avlan();
    }
}
