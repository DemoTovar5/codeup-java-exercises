package collections;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLecture {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNameArray()));
    }

//    public static int[] getIntArray(){
//        return new int[]{1,2,3};
//    }
//
//    public static int[] getIntArray(int length) {
//         int[] intArray = new int[length];
//
//        for(int i = 0; i < intArray.length; i++){
//            intArray[i] = i * 2;
//
//        }
//
//        return intArray;
//    }

public static String[] getNameArray(){
        Scanner sc = new Scanner(System.in);
    System.out.println("How many names do you want to enter?");

    int namesLength = sc.nextInt();
    String[] namesArr = new String[namesLength];

    for (int i = 0; i < namesLength; i++){
        namesArr[i] = sc.next();
    }

    return  namesArr;
}





}
