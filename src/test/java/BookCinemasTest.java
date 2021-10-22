import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class BookCinemasTest {
    @Test
    public void bookCinemaTickets() {
        //arrange
        BookCinemas myBooking = new BookCinemas();
        //act
        String result = myBooking.BookTicket(1);
        //assert
        assertTrue(result.equals("A1  "));

        //act
        result = myBooking.BookTicket(2);
        //assert
        assertTrue(result.equals("A1  A2  "));

        //act
        result = myBooking.BookTicket(3);
        //assert
        assertTrue(result.equals("A1  A2  A3  "));

    }

    @Test
    public void bookInvalidNumberOfCinemaTickets() {
        //arrange
        BookCinemas myBooking = new BookCinemas();
        //act
        String result = myBooking.BookTicket(4);
        //assert
        assertTrue(result.equals(""));

        //act
        result = myBooking.BookTicket(4);
        //assert
        assertTrue(result.equals(""));

    }

}
