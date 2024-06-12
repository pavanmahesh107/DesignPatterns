package Inheritance.ConstructorChaining;

public class C extends B{
int age;
    C(){
        System.out.println("C's 0-arg Constructor");
    }
    C(String b ){
        super(6);
        System.out.println("C's 1-arg constructor");
    }

    C(String name,int a){
        System.out.println("c's 2-arg Constructor");
    }
}
