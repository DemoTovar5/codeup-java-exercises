public class MainMethod {
    public static void main(String[] args) {
        testPerson();


    }

    public static void testPerson(){

        System.out.println("Creating person with name Demo....");
        Person person = new Person("Demo");
        System.out.println(person.sayHello());
        System.out.println("Changing " + person.getName() + "'s name to Tristan");
        person.setName("Tristan");
        System.out.println(person.sayHello());


    }
}


