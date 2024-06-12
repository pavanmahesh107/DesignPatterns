package Inheritance;

public class Instructor extends User {
    String Company;
    double avg_rat;
//    Instructor() {
//        System.out.println("Instructor constructor");
//    }

    void login(String name){
        System.out.println("Instructor with name is logging in");
    }

    void login(){
        System.out.println("Method from the user class is over ridding Instructor class");
    }

    public static void main(String[] args) {
        User user = new Instructor();
        user.login();

    }

}
