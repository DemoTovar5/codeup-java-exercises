import java.util.Scanner;
public class methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the name of a basketball team: ");
//        String basketballTeam = sc.next();
//          System.out.println("Enter your full name: ");
        System.out.println("Please tell me about yourself: Name, Age, Do you like pets? [Y/N] ");
//          String userName = sc.nextLine();
        String userInfo = sc.next();

//          String[] array = userName.split(" ");
//        System.out.println(Teams(basketballTeam));
//        System.out.println(lengthOf(Teams(basketballTeam)));
//        System.out.println(Names(userName));
//        System.out.println(Names(array[0],array[1]));
          System.out.println(Name(userInfo));
    }
//
//    public static String Teams(String basketballTeam){
//        return basketballTeam + " is the best team.";
//    }
//
//   public static String lengthOf(String basketballTeam){
//        return "The length of the entire statement is : " + basketballTeam.length();
//   }


//    public static String Names(String userName) {
//       return "Hello " + userName;
//    }

//    public static String Names(String firstName, String lastName){
//        return "Hello " + firstName + " " + lastName;
//    }

    public static String Name(String userInfo) {
         return  userInfo;
    }

}

//    WARMUP
//    TODO: prompt a user to tell us about themselves (age, name, if
//     they have any pets (true/false). Using method overloading, create
//     methods that will return the first fact they told us about
//     themselves. ex: I can input: 18 -- Laura -- false in which case I
//     expect you to return: 18. but if I tell you my name first: Laura --
//     false -- 18. I expect you to return "Laura" ... etc.



//    TODO: invoke a method that accepts (and returns) the following:
//        - accepts: your first name and your last name. returns: A
//        string that reads: "Hello Laura Ruiz-Roehrs (replace with your
//        first and last)";


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


