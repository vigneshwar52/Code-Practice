package DesignPatterns.CreationalDesignPatterns;

class threadPoolManager{
    private static threadPoolManager instance;

    private threadPoolManager(){
        System.out.println("Initializing Thread Pool Manager Class");
    }
    public static synchronized threadPoolManager getInstance(){
        if(instance == null){
            return instance = new threadPoolManager();
        }
        return instance;
    }
    public void getStatus(){
        System.out.println("Invoking Thread Pool Manager Class");
    }
}
/*
 * Static -- (Able to access methods without creating an object to its belonging class)
 * A static method belongs to the class and can be called without creating an object of the class. 
 * These methods can only access other static members (variables or methods) directly.
 */

public class Singleton {
    public static void main(String[] args) {
        threadPoolManager manager = threadPoolManager.getInstance();
        manager.getStatus();
    }
}