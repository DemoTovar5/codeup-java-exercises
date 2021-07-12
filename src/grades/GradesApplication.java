package grades;

import Calculator.Input;

import javax.naming.Name;
import java.util.HashMap;
import java.util.Locale;

public class GradesApplication {
    public static HashMap<String, Student> students = new HashMap<>();

    public static void main(String[] args) {
        Student Demo = new Student("Demo");
        Demo.addGrade(96);
        Demo.addGrade(81);
        Demo.addGrade(74);

        Student Wagner = new Student("Wagner");
        Wagner.addGrade(100);
        Wagner.addGrade(90);
        Wagner.addGrade(80);

        Student Sean = new Student("Sean");
        Sean.addGrade(98);
        Sean.addGrade(92);
        Sean.addGrade(77);

        Student Jordy = new Student("Jordy");
        Jordy.addGrade(100);
        Jordy.addGrade(99);
        Jordy.addGrade(98);

        System.out.println(students);
        Application();

    }

    public static void Application() {
        HashMap<String, Student> students = new HashMap<>();

        students.put("Bestgamerever3000", new Student("Demo", 100, 90, 80));
        students.put("southbeachWagner", new Student("Wagner", 95, 78, 85));
        students.put("imbadatvideogames", new Student("Sean", 55, 75, 60));
        students.put("JordytheInstructor", new Student("Jordy", 100, 99, 98));

        Input input = new Input();
        System.out.println("Welcome!");
        do {
            System.out.print("\n");
            for (String key : students.keySet()) {
                System.out.print("|" + key + "| ");
            }
            System.out.println("Which Student would you like to see more info on?");
            System.out.println("> ");
            String userInput = input.getString();

            Student userName = students.get(userInput);

            if (userName == null) {
                System.out.println("Sorry, no student found with the GitHub username of  " + userInput + ".");
            } else {
                System.out.printf("\nName: %s - Github Username: %s\n", userName.getName(), userInput);
                System.out.printf("\nCurrent Average: %.1f \n", userName.getGradeAverage());
            }

        } while(input.yesNo());

    }


}


