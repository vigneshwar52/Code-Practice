package zoho.RailwayBookingApplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println(" 1. Book Ticket \n 2. Cancel Ticket \n 3. Available Tickets \n 4. Booked Tickets \n 5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:{
                    System.out.println("Enter passenger details");
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    // System.out.print("Birth Preferences: ");
                    String preference = "";

                    while (true) {
                        System.out.print("Birth Preferences (L/M/U): ");
                        preference = sc.nextLine().trim().toUpperCase();

                        if (preference.equals("L") || preference.equals("M") || preference.equals("U")) {
                            break;
                        } else {
                            System.out.println("Invalid input. Please enter 'L', 'M', or 'U'.");
                        }
                    }

                    Passenger passenger = new Passenger(name,age, preference);
                    bookTicket(passenger);
                }
                    break;
                case 2:{
                    System.out.println("Enter Passenger ID to Cancel");
                    int id = sc.nextInt();
                    cancelTicket(id);
                }
                break;

                case 3:{
                    TicketBooker booker = new TicketBooker();
                    booker.printAvailableTicket();
                }
                    break;

                case 4:{
                    TicketBooker booker = new TicketBooker();
                    booker.printPassengers();
                }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    loop = false;
                    break;
            
                default:
                    break;
            }
        }
        sc.close();
    }

     static void bookTicket(Passenger p) {
        TicketBooker booker = new TicketBooker();
        if(TicketBooker.availableWaitingList == 0){
            System.out.println("No Tickets available");
            return;
        }

        if((p.berthPref.equals("L") && TicketBooker.availableLowerBerths > 0 )||
            (p.berthPref.equals("M") && TicketBooker.availableMiddleBerths > 0) ||
                (p.berthPref.equals("U") && TicketBooker.availableUpperBerths > 0)){
            
                System.out.println("Preferred Birth Available");

            if(p.berthPref.equals("L")){
                bookLowerBirth(p, booker);
            }else if(p.berthPref.equals("M")){
                bookMiddleBirth(p, booker);
            }else if(p.berthPref.equals("U")){
                bookUpperBirth(p, booker);
            }
        }else if(TicketBooker.availableLowerBerths > 0){
            bookLowerBirth(p, booker);
        }else if(TicketBooker.availableMiddleBerths > 0){
            bookMiddleBirth(p, booker);
        }else if(TicketBooker.availableUpperBerths > 0){
            bookUpperBirth(p, booker);
        }else if(TicketBooker.availableRacTickets >0){
            System.out.println("RAC Given");
            booker.addToRac(p, TicketBooker.racPositions.get(0), "RAC");
        }else if(TicketBooker.availableWaitingList >0){
            System.out.println("Added to WL");
            booker.addToWL(p, TicketBooker.waitingListPositions.get(0), "WL");
        }
    }

    private static void bookUpperBirth(Passenger p, TicketBooker booker) {
        System.out.println("Given Lowe Birth");
        booker.bookTicket(p,(TicketBooker.upperBerthsPositions.get(0)),"U");
        
        TicketBooker.upperBerthsPositions.remove(0);
        TicketBooker.availableUpperBerths--;
    }

    private static void bookMiddleBirth(Passenger p, TicketBooker booker) {
        System.out.println("Given Middle Birth");
        booker.bookTicket(p,(TicketBooker.middleBerthsPositions.get(0)),"M");
        
        TicketBooker.middleBerthsPositions.remove(0);
        TicketBooker.availableMiddleBerths--;
    }

    private static void bookLowerBirth(Passenger p, TicketBooker booker) {
        System.out.println("Given Lower Birth");
        booker.bookTicket(p,(TicketBooker.lowerBerthsPositions.get(0)),"L");
        
        TicketBooker.lowerBerthsPositions.remove(0);
        TicketBooker.availableLowerBerths--;
    }

    public static void cancelTicket(int id){
        TicketBooker booker = new TicketBooker();
        if(!TicketBooker.passenger.containsKey(id)){
            System.out.println("unknown Passenger");
        }else{
            booker.cancelTicket(id);
        }
    }
}
