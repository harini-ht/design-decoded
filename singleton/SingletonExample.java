class Singleton {

    private static Singleton instance = null;

    private Singleton() {
        System.out.println("Singleton created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void print() {
        System.out.println("Singleton print");
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        // Singleton s = new Singleton(); // error
        // object created only once
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        // s1 and s2 are the same object
        s1.print();
        s2.print();
    }
}
