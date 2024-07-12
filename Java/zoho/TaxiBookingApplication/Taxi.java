package zoho.TaxiBookingApplication;

import java.util.ArrayList;
import java.util.List;

public class Taxi {
    static int Taxi_ID = 0;
    boolean Booked;
    int freeTime;
    int totalEarnings;
    char currentSpot;
    List<String> trips;

    public Taxi() {
        Booked = false;
        freeTime = 6;
        totalEarnings = 0;
        currentSpot = 'A';
        trips = new ArrayList<>();
        Taxi_ID = Taxi_ID +1; 
    }

    public void setDetails(Boolean booked,int freeTime,int totalEarnings,char currentSpot,String tripDetail){
        this.Booked = booked;
        this.freeTime = freeTime;
        this.totalEarnings = totalEarnings;
        this.currentSpot = currentSpot;
        this.trips.add(tripDetail);
    }
    
    public void printDetails(){
        System.out.println(this.Taxi_ID +" - "+this.totalEarnings);
        for(String str:trips){
            System.out.println(Taxi_ID +" "+str);
        }
    }
}
