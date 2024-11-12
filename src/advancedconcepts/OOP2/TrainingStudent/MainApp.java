package advancedconcepts.OOP2.TrainingStudent;

public class MainApp {

    public static void main(String[] args) {
        Student student = new Student();
        student.firstName = "Ahmet";
        student.lastName = "Dursun";
        student.grades = new int[]{47, 53, 89};
        student.showInfo();
        double studentGPA = student.getGPA();

        System.out.println("\n" + "--".repeat(25));

        Student student2 = new Student();
        student2.firstName = "Deniz";
        student2.lastName = "Gülen";
        student2.grades = new int[]{90, 85, 69};
        student2.showInfo();
        double student2GPA = student2.getGPA();

        System.out.println("\n" + "--".repeat(25));
        if (studentGPA > student2GPA) {
            System.out.printf("Daha yüksek not ortalamasına sahip öğrenci: %s %s %.2f", student.firstName, student.lastName, studentGPA);
        } else {
            System.out.printf("Daha yüksek not ortalamasına sahip öğrenci: %s %s %.2f", student2.firstName, student2.lastName, student2GPA);
        }

    }

}
