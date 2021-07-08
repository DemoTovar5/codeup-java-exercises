package Calculator;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        
        int userChoice;

        System.out.println("Please enter first number: ");
        int fnum = sc.nextInt();
        System.out.println("Please enter second number: ");
        int snum = sc.nextInt();
        System.out.println("Please Select Operation to Perform:");
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Division");
        System.out.println("4-Multiplication");
        userChoice = sc.nextInt();

        

        switch(userChoice){
            case 1: 
                calculator.addition();
                System.out.println();
                break;
            case 2:
                calculator.subtraction();
                System.out.println();
                break;
            case 3:
                calculator.division();
                System.out.println();
                break;
            case 4:
                calculator.multiplication();
                System.out.println();
                break;
        }

    }
}
