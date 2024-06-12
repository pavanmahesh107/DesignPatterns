package Interface.Defaultmethod;

public interface Vehicle {

    void move();

    default void startEnegine(){
        System.out.println("Engine is started using default method");
    }
}
