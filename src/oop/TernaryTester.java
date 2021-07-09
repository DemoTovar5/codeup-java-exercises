package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TernaryTester {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        String myArray[] = new String[size];
        System.out.println("Enter your favorite vacation spots: ");
        for (int i = 0; i < size; i++) {
            myArray[i] = sc.next();
        }

        System.out.println(Arrays.toString(myArray));
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(myArray));

        System.out.println("Enter one more favorite vacation spot: ");
        String element = sc.next();
        myList.add(element);
        myArray = myList.toArray(myArray);

        System.out.println(Arrays.toString(myArray));
    }
}

//        String userInput = sc.nextLine();
//
//        for (int i = 0; i < userInput.length(); i++) {
//
//            if(Character.isUpperCase(userInput.charAt(i))){
//                System.out.println(userInput.charAt(i));
//            }
//        }}


// TODO: Create a method which will return a String[] containing the user's favorite vacation spots
//  -> Each time the user inputs a new vacation spot, reset the array to be one element longer in length
//  -> Then, add the old elements
//  -> Finally, add the new element
//  -> When the user decides to finish inputting spots, return the String[].
//  -> sout out the returned value!