package Chapter_5;

public class Singleton {
    private volatile static Singleton instance;
    private Singleton() {

    }

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
