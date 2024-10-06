package DesignPatterns;

class Singleton {
    // Step 1: Create a private static instance of the class
    private static Singleton instance = null;

    // Step 2: Make the constructor private so that the class cannot be instantiated from outside
    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

    // Step 3: Provide a public static method that returns the instance of the class
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // lazy initialization
        }
        return instance;
    }

    public void displayMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class SingletonCreationalDesignPattern {
    public static void main(String[] args) {
        // Get the only object available
        Singleton obj1 = Singleton.getInstance();
        obj1.displayMessage();

        // Try to get another instance
        Singleton obj2 = Singleton.getInstance();
        obj2.displayMessage();

        // Check if both references are the same
        System.out.println(obj1 == obj2); // Should print true
    }
}
