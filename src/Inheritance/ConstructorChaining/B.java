package Inheritance.ConstructorChaining;

public class B extends A{
    String city;
    B(){
        System.out.println("B's 0-arg Constructor");
    }
     B(int c){
         super(6);
        System.out.println("B's Constructor");
    }
}
