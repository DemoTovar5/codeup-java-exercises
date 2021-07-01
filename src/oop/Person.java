package oop;

public class Person {

    // CLASS MEMBERS(field,constructor,properties)


    // Field
    // only members of this class can access these below fields

    private String name;
    private int age;
    private String height;
    private String nationality;


    // Constructor
    public Person(String name, int age, String height, String nationality){

        this.name = name; // making a new person
        this.age = age;
        this.height = height;
        this.nationality = nationality;


    }

    public Person(){
    }


    // Properties
// is what allows access to PRIVATE fields.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }



public String Entertained(String entertainment){
        return this.name + " is going to go " + entertainment;
}

}
