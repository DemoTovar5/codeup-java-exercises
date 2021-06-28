import java.util.Scanner;
public class methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of a basketball team: ");
        String basketballTeam = sc.next();
        System.out.println(print(basketballTeam));
        System.out.println(len(print(basketballTeam)));
    }

    public static String print (String basketballTeam){
        return basketballTeam + " is the best team.";
    }

   public static String len(String basketballTeam){
        return "The length of the entire statement is : " + basketballTeam.length();
   }







}


    //    TODO: create a new method that accepts the name of a basketball
//     team (ex: the spurs) and returns a String that says
//     "[basketballTeam] is the best team.". Invoke that method within
//     your main method (remember to pass in the name of the basketball
//     team). print out the result of the new method.




// syntax
// public - how visible your method is to other classes.
// static - available for this class and not an instance of a class.
// void - define what the data type is of what's being returned (if anything is being returned)
// main, nameOfTheMethod - name of the Method - you come up with that.
// (dataType params) - parameters go in the parenthesis with the data type defined.
// {your code goes in the curly braces}


