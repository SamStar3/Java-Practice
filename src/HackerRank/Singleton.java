package HackerRank;

public class Singleton {
    private static Singleton instance;

    // String variable to hold the initial message
    public String str;

    // Private constructor to prevent instantiation from outside
    private Singleton() {}

    // Public static method to provide a global point of access to the instance
    public static Singleton getSingleInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    public static void main(String[] args) {
        Singleton singleInstance = Singleton.getSingleInstance();
        singleInstance.str = "Hello I am a string part of Singleton class";
        System.out.println(singleInstance.str);

        // Verify that the same instance is returned
        Singleton anotherInstance = Singleton.getSingleInstance();
        System.out.println(anotherInstance.str); // This should print the same string as above
    }
}
