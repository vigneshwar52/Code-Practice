package BasicJavaPrograms;
enum TrafficLight {
    RED(30),GREEN(20),YELLOW(10);

    private int duration;

    TrafficLight(int duration){
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

public class Enumeration {
    
    public static void main(String[] args){
        TrafficLight lightDuration = TrafficLight.RED;
        System.out.println(lightDuration.getDuration());
    }
}
