/* Base class Person: private fields name, id, and method getRoleDetails()
Subclasses:
Student: add program
Teacher: add subject
Admin: add department
Override getRoleDetails() to show respective info.
File: UniversitySystem.java */

class Person {
    private String name;
    private int id;

    public Person(String n, int i){
        this.name = n;
        this.id = i;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void setId(int i){
        this.id = i;
    }

    public int getId(){
        return id;
    }

    public void getRoleDetails(){
        System.out.println("--------------------------");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
    }
}

class Student extends Person {
    private String program;

    public Student(String n, int i, String p){
        super(n, i);
        this.program = p;
    }

    public void setProgram(String p){
        this.program = p;
    }

    public String getProgram(){
        return program;
    }

    @Override
    public void getRoleDetails(){
        super.getRoleDetails();
        System.out.println("Program: " + getProgram());
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String n, int i, String s){
        super(n, i);
        this.subject = s;
    }

    public void setSubject(String s){
        this.subject = s;
    }

    public String getSubject(){
        return subject;
    }

    @Override
    public void getRoleDetails(){
        super.getRoleDetails();
        System.out.println("Subject: " + getSubject());
    }
}

class Admin extends Person {
    private String department;

    public Admin(String n, int i, String d){
        super(n, i);
        this.department = d;
    }

    public void setDepartment(String d){
        this.department = d;
    }

    public String getDepartment(){
        return department;
    }

    @Override
    public void getRoleDetails(){
        super.getRoleDetails();
        System.out.println("Department: " + getDepartment());
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 123123, "BCSIT");
        Teacher teacher = new Teacher("Jason", 845631, "Maths");
        Admin admin = new Admin("Kunal", 99999, "IT");

        student.getRoleDetails();
        teacher.getRoleDetails();
        admin.getRoleDetails();
    }
}
