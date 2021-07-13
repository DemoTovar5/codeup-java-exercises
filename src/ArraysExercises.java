import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(addPerson()));

        Person person1 = new Person("Jon");
        Person person2 = new Person("Paul");
        Person person3 = new Person("Ringo");

        String[] personArr = {person1.getName(), person2.getName(),person3.getName()};
        System.out.println(Arrays.toString(personArr));

        String[] newArr = addPerson(personArr,"George");
        System.out.println(Arrays.toString(newArr));

    }

      static String[] addPerson(String[] person,String newPerson){

        person = Arrays.copyOf(person,person.length + 1);

        person[person.length-1] = newPerson;

        return person;

      }












}







