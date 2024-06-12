package Inheritance.ConstructorChaining;

public class Main {
    public static void main(String[] args) {
        A a = new C();
        a.name = "Pavan";
        ((C)a).age = 14;
    }
}
