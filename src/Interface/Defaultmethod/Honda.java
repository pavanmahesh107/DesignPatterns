package Interface.Defaultmethod;

public class Honda implements Vehicle{
    @Override
    public void move() {
        System.out.println("Honda is a car Brand");
    }

    @Override
    public void startEnegine() {
        System.out.println("We are overriding the default method of Interface");
    }
}
