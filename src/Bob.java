import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("\n");
        String userInput = sc.next();
        if(userInput.endsWith("?")){
            System.out.println("sure");
        }else if(userInput.endsWith("!")){
            System.out.println("Woah, Chill out!");
        }else if(userInput.equals("")){
            System.out.println("Fine,be that way");
        }else{
            System.out.println("Whatever");
        }







    }
}