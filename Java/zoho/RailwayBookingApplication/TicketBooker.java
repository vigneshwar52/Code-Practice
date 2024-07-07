package zoho.RailwayBookingApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class TicketBooker {
    int availableLowerBerths = 1;
    int availableMiddleBerths = 1;
    int availableUpperBerths = 1;
    int availableRacTickets = 1;
    int availableWaitingList = 1;

    Queue<Integer> racList = new LinkedList<>();
    Queue<Integer> waitingList = new LinkedList<>();
    Queue<Integer> bookedTicketList = new LinkedList<>();

    List<Integer> lowerBerthsPositions = new ArrayList<>(Arrays.asList(availableLowerBerths));
    List<Integer> middleBerthsPositions = new ArrayList<>(Arrays.asList(availableMiddleBerths));
    List<Integer> upperBerthsPositions = new ArrayList<>(Arrays.asList(availableUpperBerths));
    List<Integer> racPositions = new ArrayList<>(Arrays.asList(availableRacTickets));
    List<Integer> waitingListPositions = new ArrayList<>(Arrays.asList(availableWaitingList));

    static Map<Integer,Passenger> passenger = new HashMap<>();

    public void bookTicket(Passenger p,int berthInfo,String allotedBirth){
        
        p.seatNumber = berthInfo;
        p.allotedBirth = allotedBirth;
        passenger.put(p.passengerID, p);
        
        bookedTicketList.add(p.passengerID);
        System.out.println("Booked Successfully");
    }

    public void addToRac(Passenger p,int racInfo,String allotedRAC){
        p.seatNumber = racInfo;
        p.allotedBirth = allotedRAC;
        passenger.put(p.passengerID, p);
        
        bookedTicketList.add(p.passengerID);
        availableRacTickets--;
        System.out.println("Added to RAC Successfully");
    }

    public void addToWL(Passenger p,int waitingListInfo,String allotedWL){
        p.seatNumber = waitingListInfo;
        p.allotedBirth = allotedWL;
        passenger.put(p.passengerID, p);
        
        bookedTicketList.add(p.passengerID);

        availableWaitingList--;

        waitingListPositions.remove(0);

        System.out.println("added to WL");
    }

    public void cancelTicket(int passengerID){
        Passenger p = passenger.get(passengerID);
        passenger.remove(Integer.valueOf(passengerID));

        bookedTicketList.remove(Integer.valueOf(passengerID));

        int positionBooked = p.seatNumber;
        System.out.println("Cancelled Successfully");

        if(p.allotedBirth.equals("L")){
            availableLowerBerths++;
            lowerBerthsPositions.add(positionBooked);
        }else if(p.allotedBirth.equals("M")){
            availableMiddleBerths++;
            middleBerthsPositions.add(positionBooked);
        }else if(p.allotedBirth.equals("U")){
            availableUpperBerths++;
            upperBerthsPositions.equals(positionBooked);
        }

        if(racList.size()>0){
            Passenger passengerFromRAC = passenger.get(racList.poll());
            int positonrac = passengerFromRAC.seatNumber;
            racPositions.add(positonrac);
            racList.remove(Integer.valueOf(passengerFromRAC.passengerID));
            availableRacTickets++;

            if(waitingList.size()>0){
                Passenger passengerFromWL = passenger.get(waitingList.poll());
                int positonWL = passengerFromWL.seatNumber;
                waitingListPositions.add(positonWL);
                waitingList.remove(Integer.valueOf(passengerFromWL.passengerID));

                passengerFromWL.seatNumber = racPositions.get(0);
                passengerFromWL.allotedBirth = "RAC";
                racPositions.remove(0);
                racList.add(passengerFromWL.passengerID);

                availableWaitingList++;
                availableRacTickets--;
            }
            Main.bookTicket(passengerFromRAC);
        }
    }

    public void printAvailableTicket(){
        System.out.println("Available Lower Berths "  + availableLowerBerths);
        System.out.println("Available Middle Berths "  + availableMiddleBerths);
        System.out.println("Available Upper Berths "  + availableUpperBerths);
        System.out.println("Availabel RACs " + availableRacTickets);
        System.out.println("Available Waiting List " + availableWaitingList);
        System.out.println("--------------------------");
    }

    public void printPassengers()
    {
        if(passenger.size() == 0)
        {
            System.out.println("No details of passengers");
            return;
        }
        for(Passenger p : passenger.values())
        {
            System.out.println("PASSENGER ID " + p.passengerID );
            System.out.println(" Name " + p.name );
            System.out.println(" Age " + p.age );
            System.out.println(" Status " + p.seatNumber + p.allotedBirth);
            System.out.println("--------------------------");
        }
    }
}
