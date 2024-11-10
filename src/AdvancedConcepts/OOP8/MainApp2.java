package AdvancedConcepts.OOP8;

import AdvancedConcepts.OOP8.kutuphanepro.Kitap;

import java.util.Scanner;

public class MainApp2 {

    public static void main(String[] args) {
        System.out.println("Kitap Giriş Ekranı");
        Scanner input = new Scanner(System.in);

        System.out.print("Kitabın Adı : ");
        String adi = input.nextLine();

        System.out.print("Kitabın Yazarı : ");
        String yazari = input.nextLine();

        System.out.print("Kitabın Sayfa Adedi : ");
        int sayfaAdedi = input.nextInt();

        Kitap kitap = new Kitap(adi, yazari, sayfaAdedi);

        kitap.kaydet();
    }
}
