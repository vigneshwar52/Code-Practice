package zoho.RailwayBookingApplication;

public class Passenger {
    static int id = 0;
    String name;
    int age;
    String berthPref;
    int passengerID;
    String allotedBirth;
    int seatNumber;

    public Passenger(String name,int age, String berthPref) {
        this.passengerID = ++id;
        this.name = name;
        this.berthPref = berthPref;
        this.age = age;
        allotedBirth = "";
        seatNumber = -1;
    }
}
