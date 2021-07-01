public class Oberon {

    // fields

    private String name;
    private String subject;
    private int length;
    private String instructors;
    private String schedule;
    private int size;


    // Constructor

    public Oberon (String name, int size, int length, String subject, String instructors, String schedule){

        this.name = name;
        this.size = size;
        this.length = length;
        this.instructors = instructors;
        this.subject = subject;
        this.schedule = schedule;

    }

    public Oberon(){

    }


    // properties

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getInstructors() {
        return instructors;
    }

    public void setInstructors(String instructors) {
        this.instructors = instructors;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
