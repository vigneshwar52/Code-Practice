package BasicJavaPrograms.lamda;

public class A {
    public void show(int n){
        System.out.println("A in show"+n);
        ClassA print = new ClassA();
        InnerA inner = ()->System.out.println("Inside Interface");
        inner.print();
        print.print();
    }

    @FunctionalInterface
    public interface InnerA {
        public void print();
    }

    public class ClassA implements InnerA{
        
       public void print(){
            System.out.println("Hello in ClassA");
        }
    }
}
