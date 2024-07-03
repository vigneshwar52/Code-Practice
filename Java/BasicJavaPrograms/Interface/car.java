package BasicJavaPrograms.Interface;

public interface car {
    void name();
    void color();
    default void type(){
        System.out.println("petrol");
    }
}
