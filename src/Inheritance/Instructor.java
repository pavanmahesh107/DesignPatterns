package Inheritance;

public class Instructor extends User {
    String Company;
    double avg_rat;
//    Instructor() {
//        System.out.println("Instructor constructor");
//    }

    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.email = "pavanmahesh107@gmai.com";
        System.out.println("DEBUG");

    }

}
