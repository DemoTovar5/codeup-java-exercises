package oop;

import java.util.Arrays;
import java.util.Scanner;

public class TernaryTester {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

//      myArr();
//        System.out.println("Enter your age: ");
//        int money = sc.nextInt();
//        System.out.println("Enter how much money you have: ");
//        int age = sc.nextInt();
//
//        breaktheBank(age,money);

primeNum();
    }

//        System.out.println("Enter the size of the array: ");
//        int size = sc.nextInt();
//
//        String myArray[] = new String[size];
//        System.out.println("Enter your favorite vacation spots: ");
//        for (int i = 0; i < size; i++) {
//            myArray[i] = sc.next();
//        }
//
//        System.out.println(Arrays.toString(myArray));
//        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(myArray));
//
//        System.out.println("Enter one more favorite vacation spot: ");
//        String element = sc.next();
//        myList.add(element);
//        myArray = myList.toArray(myArray);
//
//        System.out.println(Arrays.toString(myArray));

    public static void myArr() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String userInput = sc.nextLine();

        String[] strArray = userInput.split("\\s");

        System.out.println(Arrays.toString(strArray));

    }

    public static void primeNum() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int num = 0;
        String primeNumbers = "";
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + ", ";
            }
        }
        System.out.println("Prime numbers are: ");
        System.out.println(primeNumbers);
    }

}


//public static void breaktheBank(int money, int age){
//    if(money >= 200 &&  age >= 16){
//        System.out.println("Good to go buddy!");
//    } else{
//        throw new NumberFormatException("Get your age and/or money up!");
//    }




//        String userInput = sc.nextLine();
//
//        for (int i = 0; i < userInput.length(); i++) {
//
//            if(Character.isUpperCase(userInput.charAt(i))){
//                System.out.println(userInput.charAt(i));
//            }
//        }}

//warmup: write a method that accepts a string and returns a String array that splits at the spaces - you can write this within any main method

// TODO: Create a method which will return a String[] containing the user's favorite vacation spots
//  -> Each time the user inputs a new vacation spot, reset the array to be one element longer in length
//  -> Then, add the old elements
//  -> Finally, add the new element
//  -> When the user decides to finish inputting spots, return the String[].
//  -> sout out the returned value!