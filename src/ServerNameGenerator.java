import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {

        String[] animals = {"dog","cat","pig","donkey","pikachu","bird","lizard","llama","kangaroo","fish"};

        String[] adjective = {"outstanding", "useful", "woebegone", "outrageous", "fragile", "fumbling", "sad","happy", "strong", "quick"};

        String Animal = random(animals);
        String Adj = random(adjective);

        System.out.println("Your server name: ");
        System.out.println(Adj+ "-" + Animal);

    }

    public static String random(String[] str){

        Random random = new Random();
        int randomItem = random.nextInt(str.length);
        String randomString = str[randomItem];

        return randomString;


    }





    }





