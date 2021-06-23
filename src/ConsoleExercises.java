import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        double pi = 3.14159;
//
//        System.out.printf("The Value of pi is approximately: %.2f\n", pi);
//

//        System.out.println("Enter a number: ");
//
//        Integer firstNum = sc.nextInt();


//        System.out.println("Enter 3 words: ");
//
//        String firstWord = sc.next();
//        String secondWord = sc.next();
//        String thirdWord = sc.next();
//
//        System.out.printf("First word: %s\nSecond word: %s\nThird word: %s\n", firstWord, secondWord, thirdWord);


//        System.out.println("Enter a full sentence: ");
//        String myString = sc.nextLine();
//        System.out.println(myString);

        System.out.println("Please enter the dimensions of your room: ");

        int length = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());

        System.out.printf("Perimeter: %s", (2 * length) + (2 * width));

        System.out.printf("Perimeter: %s\n", (2 * length) + (2* width));
        System.out.printf("Area: %s", length * width);


    }

}

