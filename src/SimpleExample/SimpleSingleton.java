package SimpleExample;

public class SimpleSingleton {

    private static SimpleSingleton object;

    private SimpleSingleton() {

    }

    public static SimpleSingleton getInstance() {
        if (object == null) {
            object = new SimpleSingleton();
        }
        return object;
    }

    public void ShowMessage(){
        System.out.println("Simple Singleton Class");
    }
}
