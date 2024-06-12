package Inheritance.MethodOverloading;

public class User {

    void sayHello() {
        System.out.println("Say Hello");
    }

    void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    void sayHello(int a) {
        System.out.println("The integer value is " + a);
    }

    void sayHello(String name, int age) {
        System.out.println("My Name is " + name + "and age " + age);
    }

    void sayHello(int age, String name) {
        System.out.println("My age is " + age + "and name is" + name);

    }
}
