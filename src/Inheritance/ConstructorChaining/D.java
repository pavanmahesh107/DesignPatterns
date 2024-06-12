package Inheritance.ConstructorChaining;

public class D extends C{
    D(){
        System.out.println("D's 0-arg Constructor");
    }
    D(int a){
        super("Pavan",18);
        System.out.println("D's 1-arg constructor");
    }
    public static void main(String[] args) {
        D d = new D(18);
    }
}
