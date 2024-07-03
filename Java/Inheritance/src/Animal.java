public class Animal {
    String name;
    int age;

    public Animal(){};

    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
   void  printInfo(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
}
