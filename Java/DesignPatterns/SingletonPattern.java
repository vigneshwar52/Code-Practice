package DesignPatterns;
public class SingletonPattern {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run(){
             Abc obj1 = Abc.getInstance();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run(){
             Abc obj1 = Abc.getInstance();
            }
        });
        t1.start();
        t2.start();
    }
}

class Abc{
    public static Abc Instance;
    private Abc(){
        System.out.println("Instance Created");
    }
    public static Abc getInstance(){ //Double Checked Locking
        if(Instance == null){
            synchronized(Abc.class){
                if(Instance == null){
                    Instance = new Abc();
                }
            }
        }
        return Instance;
    }
}
