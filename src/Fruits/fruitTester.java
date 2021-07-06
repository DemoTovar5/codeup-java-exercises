package Fruits;

public class fruitTester {
    public static void main(String[] args) {
        myFruit apple = new myFruit();
        System.out.println(apple.iamFruit());

         apple.name = "apple";
         apple.color = "green";
         apple.flavor = "sweet";
         apple.isAvailable = "yes";

        System.out.println(apple.name + " is a delicious fruit!");

    }
}