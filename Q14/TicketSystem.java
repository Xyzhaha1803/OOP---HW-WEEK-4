/* Base class Ticket: fields ticketNumber, price, method generateTicket()
Subclasses:
BusTicket: includes seatNumber
TrainTicket: adds coachType
FlightTicket: adds boardingGate
Each override generateTicket() to print formatted ticket info.
File: TicketSystem.java */

class Ticket {
    public int ticketNumber;
    public double price;

    public void generateTicket(){
        System.out.println("----------------------");
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Price: " + price);
    }
}

class BusTicket extends Ticket {
    public String seatNumber;

    public BusTicket(int tN, double p, String sN){
        this.ticketNumber = tN;
        this.price = p;
        this.seatNumber = sN;
    }

    public void generateTicket(){
        System.out.println("----------------------");
        System.out.println("Bus Ticket");
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Price: $" + price);
        System.out.println("Seat Number: " + seatNumber);
    }
}

class TrainTicket extends Ticket {
    public String coachType;

    public TrainTicket(int tN, double p, String cT){
        this.ticketNumber = tN;
        this.price = p;
        this.coachType = cT;
    }

    public void generateTicket(){
        System.out.println("----------------------");
        System.out.println("Train Ticket");
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Price: $" + price);
        System.out.println("Coach Type: " + coachType);
    }
}

class FlightTicket extends Ticket {
    public String boardingGate;

    public FlightTicket(int tN, double p, String bG){
        this.ticketNumber = tN;
        this.price = p;
        this.boardingGate = bG;
    }

    public void generateTicket(){
        System.out.println("----------------------");
        System.out.println("Plane Ticket");
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Price: $" + price);
        System.out.println("Boarding Gate: " + boardingGate);
    }
}

public class TicketSystem {
    public static void main(String[] args) {
        BusTicket bus = new BusTicket(123, 4.50, "A3");
        TrainTicket train = new TrainTicket(4444, 9.25, "Basic");
        FlightTicket flight = new FlightTicket(983131, 120, "G10");

        bus.generateTicket();
        train.generateTicket();
        flight.generateTicket();
    }
}
