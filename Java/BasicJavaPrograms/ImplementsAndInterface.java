package BasicJavaPrograms;

    interface Electric {
        void charge();
    }
    
    abstract class Vehicle {
        abstract void start();
    
        void stop() {
            System.out.println("Vehicle stopped");
        }
    }
    
    class ElectricCar extends Vehicle implements Electric {
        @Override
        void start() {
            System.out.println("Electric car started");
        }
    
        @Override
        public void charge() {
            System.out.println("Electric car charging");
        }
    }
    
    public class ImplementsAndInterface {
        public static void main(String[] args) {
            ElectricCar myCar = new ElectricCar();
            myCar.start();
            myCar.charge();
            myCar.stop();
        }
    }
    
