/* Class Student with private fields: name, rollNumber, marks[].
Encapsulate with getters/setters.
Method calculateAverage() returns average marks.
Subclass GraduateStudent adds thesisTopic and a method printThesisTitle().
Demonstrate both types of students.
File: GradeBook.java. */

class Student {
    private String name;
    private int rollNumber;
    private int marks[];

    public Student() {
        this.marks = new int[4];
    }

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void setRollNumber(int rn){
        this.rollNumber = rn;
    }

    public int getRollNumber(){
        return rollNumber;
    }

    public void setMarks(int m, int i){
        this.marks[i] = m;
    }

    public int getMarks(int i){
        return marks[i];
    }

    public int calculateAverage(){
        int total = 0;
        for(int i = 0; i < marks.length; i++){
            total += marks[i];
        }

        int averageMarks = (total / marks.length);

        return averageMarks;
    }
}

class GraduateStudent extends Student{
    private String thesisTopic;

    public void setThesisTopic(String tt){
        this.thesisTopic = tt;
    }

    public String getThesisTopic(){
        return thesisTopic;
    }

    public void printThesisTitle(){
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}

public class GradeBook {
    public static void main(String[] args) {
        Student student = new Student();
        GraduateStudent gStudent = new GraduateStudent();

        student.setMarks(65, 0);
        student.setMarks(70, 1);
        student.setMarks(95, 2);
        student.setMarks(73, 3);

        int averageMarks = student.calculateAverage();
        System.out.println("Average Marks: " + averageMarks);

        gStudent.setThesisTopic("Burgers are good for health.");
        gStudent.printThesisTitle();
    }
}
