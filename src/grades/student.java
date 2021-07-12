package grades;
import java.util.ArrayList;

class Student {

    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();
    public ArrayList<Integer> grade = new ArrayList<>();

    public Student(String name, int ...grades) {
        setName(name);
        addGrades(grades);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public ArrayList<Integer> getGrade() {
        return grade;
    }

    public void setGrade(ArrayList<Integer> grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student student = new Student("Demo");

        student.addGrade(100);
        student.addGrade(90);
        student.addGrade(80);
        System.out.println(student.grade);
        double average = student.getGradeAverage();
        System.out.println(average);
    }

    public String getName () {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade (int grade){
        this.grade.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for (double grade : this.grade) {
            sum += grade;
        }
        return sum / grade.size();
    }

    public void addGrades(int...grades){
        for(int grade:grades){
            this.addGrade(grade);
        }
    }


}