public class Mammal extends Animal{
    boolean hasfur;
    
    public Mammal(String name,int age,boolean hasfur){
        super(name,age);
        this.hasfur = hasfur;
    }
    void  printInfo(){
        super.printInfo();
        System.out.println("has fur = "+hasfur);
    }
}
