package zoho.TaxiBookingApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Booking {

    private static List<Taxi> createTaxi(int n) {
        List<Taxi> taxis = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            Taxi t = new Taxi();
            taxis.add(t);
        }
        return taxis;
    }

    private static List<Taxi> getFreeTaxi(List<Taxi> taxis,int pickupTime,char pickupPoint){
        List<Taxi> freeTaxis = new ArrayList<>();
        for(Taxi t:taxis){
            if(pickupTime>t.freeTime && Math.abs((t.currentSpot) - (pickupPoint))<=(t.freeTime - pickupTime)){
                freeTaxis.add(t);
            }
        }return freeTaxis;
    }

    private static void bookTaxi(int taxi_ID, char pickupPoint, char dropPoint, int pickupTime, List<Taxi> freeTaxis) {
        int distanceBetweenPickupDrop = 0;
        int totalEarnings = 0;
        int nextFreeTime = 0;
        Taxi bookedTaxiDetail = null;
        String tripDetail = "";
        int min;
        
        for(Taxi t:freeTaxis){
            int distanceBetweenTaxiCustomer = Math.abs((t.currentSpot - pickupPoint)) * 15;

            bookedTaxiDetail = t;
            distanceBetweenPickupDrop = Math.abs(pickupPoint - dropPoint) * 15;

            totalEarnings = (distanceBetweenPickupDrop - 5) *10 +100;

            nextFreeTime = pickupTime + (distanceBetweenPickupDrop/15);

            tripDetail = taxi_ID + "               " + taxi_ID + "          " + pickupPoint +  "      " + dropPoint + "       " + pickupTime + "          " +nextFreeTime + "           " + totalEarnings;
            min = distanceBetweenTaxiCustomer;
        }
        bookedTaxiDetail.setDetails(true, bookedTaxiDetail.totalEarnings+totalEarnings, totalEarnings, dropPoint, tripDetail);
        System.out.println("Taxi " + taxi_ID + " booked");
    }

    public static void main(String[] args) {

        List<Taxi> taxi = createTaxi(4);

        Scanner sc = new Scanner(System.in);

        boolean isContinue = true;
        while (isContinue) {
            System.out.println("0 - Book");
            System.out.println("1 - Print Details");
            System.out.println("2 - Exit");
            
            int choice = sc.nextInt();
            int Taxi_ID = 1;

            switch (choice) {
                case 0:{
                    int customerID = Taxi_ID;
                    System.out.println("Enter Pickup point");
                    char pickupPoint = sc.next().charAt(0);
                    System.out.println("Enter Drop point");
                    char dropPoint = sc.next().charAt(0);
                    System.out.println("Enter Pickup time");
                    int pickupTime = sc.nextInt();

                    if(pickupPoint<'A'||pickupPoint>'F'||dropPoint <'A'||dropPoint >'F'){
                        System.out.println("Entered Picking or drop point is wrong exiting");
                        return;
                    }
                    List<Taxi> freeTaxis = getFreeTaxi(taxi,pickupTime,pickupPoint);
                    
                    if(freeTaxis.size()==0){
                        System.out.println("No Taxi is near by your area");
                        return;
                    }

                    bookTaxi(Taxi_ID,pickupPoint,dropPoint,pickupTime,freeTaxis);
                    Taxi_ID++;
                }
                    
                    break;
                case 1:
                    
                    break;
                case 3:{
                    isContinue = false;
                }
                    break;
                
                default:
                    break;
            }
        }
    }
}
