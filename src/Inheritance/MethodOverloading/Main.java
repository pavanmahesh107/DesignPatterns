package Inheritance.MethodOverloading;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.sayHello();
        user.sayHello("Pavan Mahesh");
        user.sayHello(15);
        user.sayHello("Pavan",18);
        user.sayHello(15,"uma");
    }
}
