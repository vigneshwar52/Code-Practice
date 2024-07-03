public class DogInheritance extends Mammal {
    String breed;

    public DogInheritance(String name, int age, boolean hasFur, String breed) {
        super(name, age, hasFur); // Calling the constructor of Mammal
        this.breed = breed;
    }

    @Override
    public void printInfo() {
        super.printInfo(); // Calling the printInfo method of Mammal
        System.out.println("Breed: " + breed);
    }
}
