import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("How many seats are there in the movie theatre?");
        System.out.println("How many miles you are running today: ");
//        int seatsLeft = sc.nextInt();
//        movieTheatre(seatsLeft);

        int milesLeft = sc.nextInt();
        milesRan(milesLeft);
    }

//    public static void movieTheatre(int numSeats) {
//        if (numSeats > 0) {
//            System.out.println("there are " + numSeats + " available.");
//
//            numSeats--;
//            System.out.println("numSeats: " + numSeats);
//            movieTheatre(numSeats);
//        }
//
//    }

    public static void milesRan(int numMiles){
        if(numMiles >= 0){
            if(numMiles % 2 <= 0){
                System.out.println("There are " + numMiles + " left to run.");
            }
//            System.out.println("There are " + numMiles + " left to run.");
            numMiles--;
            milesRan(numMiles);
        }



    }



}

//    TODO: you are a sports manager. Prompt your client who is training
//     for a marathon how many miles they have to run today. You're the
//     coach, so you decide how many miles they ran that day. print out
//     how many miles they have left in training until they have 0 miles
//     left.