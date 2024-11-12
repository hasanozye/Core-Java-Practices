package advancedconcepts.OOP;

public class Program {

    public static void main(String[] args) {

        Dog k1 = new Dog();
        k1.type = "Kangal";
        k1.age = 3;
        k1.weight = 11.1;
        k1.bilgiGoster();

        System.out.println();
        System.out.println("--".repeat(20));

        Dog k2 = new Dog();
        k2.type = "Doberman";
        k2.age = 1;
        k2.weight = 3.5;
        k2.bilgiGoster();

        System.out.println();
        System.out.println("--".repeat(20));

        Car car = new Car();
        car.color = "RED";
        System.out.println("car.color = " + car.color);


    }

}
