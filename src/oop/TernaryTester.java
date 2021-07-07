package oop;
import java.util.Scanner;

public class TernaryTester {
    public static void main(String[] args) {
//        String str= "My name Is Demo";

        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        for (int i = 0; i < userInput.length(); i++) {

            if(Character.isUpperCase(userInput.charAt(i))){
                System.out.println(userInput.charAt(i));
            }
        }
    }
}