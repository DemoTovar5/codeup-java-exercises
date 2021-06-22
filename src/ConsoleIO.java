import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your first name?");
//
//        String firstName = sc.next();
//        System.out.printf("You entered: %s\n", firstName);

//        System.out.println("What month were you born in?");
//        System.out.println("What day of the month were you born?");
//
//        String birthMonth = sc.next();
//        String birthDay = sc.next();
//
//        System.out.printf("You entered: %s\n", birthMonth);
//        System.out.printf("You entered: %s\n", birthDay);
//
//        System.out.println("Enter a number: ");
//        int myNum = sc.nextInt();
//        System.out.println(myNum);

//        String myString = sc.nextLine(); // Will give you the ENTIRE line.
//        System.out.println(myString);

        while (sc.hasNext()){
            String word = sc.next();
            System.out.println(word);

        }

    }
}

//        System.out.println("My name is Demo"); // ln makes the consolelog go to a new line
//        System.out.println("Here's a new line");
//        System.out.printf("Maybe new line?"); // allows us to format to a new line.

//        String name = "Demo";
//        System.out.printf("My name is %S", name);

//        String mySentence = String.format("My name is %s", name);
//
//        System.out.println(mySentence);
//

//        String name = "Demo";
//
//        String role = "student";
//
//        String school = "codeup";
//
//        int age = 27;
//
//        String mySentence = String.format("My name is %S and I am a %s at %s. \n I am also %s", name, role, school, age);
//
//        System.out.println(mySentence);
//
//    }
//}
