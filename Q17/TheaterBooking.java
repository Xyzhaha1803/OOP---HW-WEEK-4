/* Class Seat: field seatNumber, method bookSeat()
Subclasses:
RegularSeat: booking is allowed anytime
PremiumSeat: booking includes snack and luxury tax
Use method overriding and encapsulation
File: TheaterBooking.java */

class Seat {
    public int seatNumber;

    public Seat(int sN){
        this.seatNumber = sN;
    }

    public void bookSeat(){
        System.out.println("-----------------");
        System.out.println("Seat Number: " + seatNumber);
    }
}

class RegularSeat extends Seat {

    public RegularSeat(int sN){
        super(sN);
    }

    @Override
    public void bookSeat(){
        super.bookSeat();
        System.out.println("Booking allowed at any time.");
    }
}

class PremiumSeat extends Seat {

    public PremiumSeat(int sN){
        super(sN);
    }

    @Override
    public void bookSeat(){
        super.bookSeat();
        System.out.println("Includes snacks and luxury tax.");
    }
}

public class TheaterBooking {
    public static void main(String[] args) {
        RegularSeat regular = new RegularSeat(34);
        PremiumSeat premium = new PremiumSeat(2);

        regular.bookSeat();
        premium.bookSeat();
    }
}
