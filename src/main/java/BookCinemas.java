import java.io.*;


public class BookCinemas {

public String BookTicket(int args) {

    int noOfTickets = args;
    String bookedTickets = "";
    SeatArrangement s1 = new SeatArrangement();

        if (noOfTickets >= 1 && noOfTickets <= 3) {
            if (s1.seatAvailability(noOfTickets)) {
                bookedTickets = s1.bookSeats(noOfTickets);
                System.out.println("Your tickets are booked. \n Seat number are: " + bookedTickets);
            }
            else {
                System.out.println("Sorry seats are not available");
            }

        } else {
            System.out.println("You can book maximum of 3 tickets");
        }

   return bookedTickets;
    }


}

