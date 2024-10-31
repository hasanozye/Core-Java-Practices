package AdvancedConcepts.OOP3.mathe;

public class Islem {

    /*
    Overload: Metotların overload (aşırı yükleme) edilmesinde metotların imzalarına bakılır.
    Bir metodun imzası o metodun parametre adetleri ve parametre tiplerinin çeşitliliğidir.

    Metotların dönüş tipi imzadan sayılmaz.
     */

    public static int topla(int a, int b) {
        return a + b;
    }

    public static double topla(double a, double b) {
        return a + b;
    }

    public static int carp(int a, int b) {
        return a * b;
    }

    public static int cikar(int a, int b) {
        return a - b;
    }

    public static int bol(int a, int b) {
        return a / b;
    }


    public static void main(String[] args) {
        int toplam = topla(5, 7);
        System.out.println("Toplam = " + toplam);
        System.out.println("Çarpım = " + carp(5, 7));

        byte b1 = 5;
        byte b2 = 7;
        System.out.println("topla(b1,b2) = " + topla(b1, b2));

        short s1 = 3;
        short s2 = 8;
        System.out.println("topla(s2,s1) = " + topla(s2, s1));

        long l1 = 12;
        long l2 = 134;
        System.out.println("topla(l1,l2) = " + topla(l1, l2));


    }


}
