package practice;

interface Animal{
  void makeSound();
}

class Dog implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog Barking");
    }
}

public class javaProgram {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
