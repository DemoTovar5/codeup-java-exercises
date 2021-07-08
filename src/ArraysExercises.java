import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(addPerson()));


        Person[] beatles = new Person[3];

        beatles[0] = new Person( "Jon");
        beatles[1] = new Person("Paul");
        beatles[2] = new Person("Ringo");

        for (int i = 0; i < beatles.length; i += 1) {
            System.out.println(beatles[i].toString());

        }
    }

//        public static String[] addPerson() {
//
//            String[] beatles = {"Jon", "Paul", "Ringo"};
//
//            beatles = Arrays.copyOf(beatles, beatles.length + 1);
//            beatles[beatles.length - 1] = "George";
//
//            for (int i = 0; i < beatles.length; i += 1) {
//                System.out.println(beatles[i]);
//
//            }
//            return beatles;
//        }

//
}







