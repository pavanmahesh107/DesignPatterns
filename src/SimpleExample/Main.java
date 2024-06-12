package SimpleExample;

public class Main {
    public static void main(String[] args) {
        SimpleSingleton singleton = SimpleSingleton.getInstance();
        singleton.ShowMessage();
    }
}
