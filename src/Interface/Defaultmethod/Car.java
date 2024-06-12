package Interface.Defaultmethod;

public class Car implements Vehicle{
    @Override
    public void move() {
        System.out.println("Car is Moving");
    }

    @Override
    public void startEnegine() {
//        Vehicle.super.startEnegine();
        System.out.println("Car is moving by starting of Engine");
    }
}
