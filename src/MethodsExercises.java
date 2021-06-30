import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Sum: " + Arithmetic(num1, num2));
        System.out.println("Subtraction: " + Subtraction(num1, num2));
        System.out.println("Multiplication: " + Multiplication(num1, num2));
        System.out.println("Division: " + Division(num1, num2));
        System.out.println("Modulus: " + Modulus(num1, num2));

        int validInput = getInteger(1,10, ;

        System.out.printf("You entered a valid number: %s", validInput);
    }

    public static int Arithmetic(int a, int b){
        return a + b;
    }

    public static int Subtraction(int a, int b){
       return a - b;
    }

    public static int Multiplication(int a, int b){
      return a * b;
    }

    public static int Division(int a, int b){
     return a - b;
    }

    public static int Modulus(int a, int b){
        return a % b;
    }



public static int getInteger(int min, int max, Scanner sc){

        int userInput = 0;
    System.out.printf("Please enter a number between %s and %s: \n", min, max);
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();

        if(userInput > max || userInput < min){
            getInteger(max,min, Scanner sc);
        }

        return userInput;
}












}
