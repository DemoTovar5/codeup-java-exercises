package collections;

import java.util.ArrayList;

public class CollectionsLecture {

    public static void main(String[] args) {
        ArrayList<String> stringArr = new ArrayList<>();

        // add first element
        stringArr.add("Demo");
        System.out.printf("Current ArrayList size: %s\n", stringArr.size());
        System.out.println(stringArr);
        System.out.println(stringArr.hashCode());

       // add second element
        stringArr.add("Raul");
        System.out.printf("Current ArrayList size: %s\n", stringArr.size());
        System.out.println(stringArr);
        System.out.println(stringArr.hashCode());

        stringArr.remove(1);
        System.out.println(System.identityHashCode(stringArr));



    }
}
