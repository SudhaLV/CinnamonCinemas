
public class SeatArrangement {


    int[][] seats = new int[3][5];
    int noOfAvailableSeats = 15;

   boolean seatAvailability(int noOfRequestedSeats){

        if (noOfAvailableSeats >= noOfRequestedSeats )
            return true;
        else
            return false;
   }

   String bookSeats(int noOfRequestedSeats ) {

       char row = '\0';
       String bookedSeats = "";


       for (int i =0; i<3; i++)
           for (int j=0; j<5; j++)
           {
               if (seats[i][j] == 0 && noOfRequestedSeats > 0)
               {
                   if(i == 0)
                   row = 'A';
                   else if(i == 1)
                    row = 'B';
                   else if(i == 2)
                       row ='C';
                   bookedSeats = bookedSeats + row + String.valueOf(j+1) + "  ";
                   //System.out.println(bookedSeats);

                   seats[i][j] = 1;
                   noOfAvailableSeats = noOfAvailableSeats -1;
                   noOfRequestedSeats = noOfRequestedSeats -1 ;

               }
           }

       return bookedSeats;
   }

}
