import java.util.Scanner;
public class ControlStatementsAndLoops {
    public static void main(String[] args) {

//        boolean expressions:

//        int chanceOfRain = 60;
//
//        if (chanceOfRain >= 50){
//            System.out.println("stay inside");
//        }
//
//        boolean isWarm = true;
//        boolean isSunny = false;


//        && will stop evaluating if the first condition is false
//        & will still read both conditions no matter what
//        & is a bitwise operator so it checks it bit by bit
//        you would use && for simple logic

//        if (isSunny && isWarm){
//            System.out.println("go swimming");
//
//        }
//
//        if(isSunny & isWarm){
//            System.out.println("go swimming");
//        }

//        String myName = "Demo";
//        String yourName = "Laura";

//        .equals()
//        System.out.println(myName.equals(yourName));
//        .equalsIgnoreCase()
//        System.out.println(myName.equalsIgnoreCase(yourName));


//        IF STATEMENT


//        MINI EXERCISE
        // TODO: create three unique usernames (user1, user2, user3).
        //  create a fourth user and set it equal to user input. (ask
        //  the user to enter a username). if the username has already
        //  been used by user1, user2, or user3, print "sorry this
        //  username already exists.

//        Scanner sc = new Scanner(System.in);
//
//        String user1 = "Demo";
//        String user2 = "Prachi";
//        String user3 = "Josh";
//
//        System.out.println("Please enter a username: ");
//
//        String userName = sc.nextLine();
//
//        if (user4.equalsIgnoreCase(user1) || user4.equalsIgnoreCase(user2) || user4.equalsIgnoreCase(user3)) {
//            System.out.println("sorry this username already exists");
//        }

//     SWITCH STATEMENTS

//        char grade = 'A';
//
//        switch(grade){
//            case 'A' :
//                System.out.println("Dope, you got an A");
//                break;
//            case 'B' :
//                System.out.println("Niceeee, almost an A");
//                break;
//            case 'C' :
//                System.out.println("C's get degrees");
//                break;
//            case 'D' :
//                System.out.println("You might as well have made an F");
//                break;
//            default:
//                System.out.println("Grades are just numbers");
//        }

//TODO: refactor your code from the previous mini exercise into a switch statement

//        switch(userName){
//            case "Prachi" :
//                System.out.println("Hi Prachi! :)");
//                break;
//            case "Josh" :
//                System.out.println("YOOOO, what's up Josh");
//                break;
//            case "Jesse" :
//                System.out.println("What up Jesse!");
//                break;
//            case "Demo" :
//                System.out.println("Ayyyy, that's me!");
//                break;
//            default:
//                System.out.println("Who is you?");
//        }

//       while vs. do....while loop:
//        condition is checked before
//        do.... while will always be executed first before condition is
//        met

//        int myNum = 2;


//        while(myNum <= 10){
//            System.out.println(myNum);
//            myNum++;
//        }

//       do.....while

//        do{
//            System.out.println(myNum);
//            myNum++;
//        }while(myNum<= 10);

//        for....loop

//        int myNum = 18;

//        for(int myNum = 0; myNum <= 20; myNum++){
//            System.out.println(myNum);
//        }

        //TODO: using previous mini exercise,
        // allow the user to input a new username several times until a unique username is entered.

        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter a username: ");

        String userName = sc.nextLine();

        switch(userName)



    }

}
