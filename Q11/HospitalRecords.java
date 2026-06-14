/* Class Patient: private fields name, age, and method getTreatmentPlan()
Subclasses:
InPatient: add roomNumber, override getTreatmentPlan() with full plan
OutPatient: add appointmentDate, override getTreatmentPlan() accordingly
Use encapsulation for all fields
File: HospitalRecords.java. */

class Patient{
    private String name;
    private int age;

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        this.age = a;
    }

    public int getAge(){
        return age;
    }
    
    public void getTreatmentPlan(){}
}

class InPatient extends Patient{
    private int roomNumber;

    public void setroomNumber(int rN){
        this.roomNumber = rN;
    }

    public int getroomNumber(){
        return roomNumber;
    }

    @Override
    public void getTreatmentPlan(){
        System.out.println("-----------------------------");
        System.out.println("In-Patient Treatment Plan");
        System.out.println("Name: " + getName() );
        System.out.println("Age: " + getAge() );
        System.out.println("Room Number: " + getroomNumber() );
        System.out.println("Start on XYZ for ABC days, continue on YUI for further ABC days.");
    }
}

class OutPatient extends Patient{
    private String appointmentDate;

    public void setappointmentDate(String aD){
        this.appointmentDate = aD;
    }

    public String getappointmentDate(){
        return appointmentDate;
    }

    @Override
    public void getTreatmentPlan(){
        System.out.println("-----------------------------");
        System.out.println("In-Patient Treatment Plan");
        System.out.println("Name: " + getName() );
        System.out.println("Age: " + getAge() );
        System.out.println("Appointment Date: " + getappointmentDate() );
    }
}

public class HospitalRecords {
    public static void main(String[] args) {
        InPatient inPatient = new InPatient();
        OutPatient outPatient = new OutPatient();

        inPatient.setName("John Doe");
        inPatient.setAge(22);
        inPatient.setroomNumber(146);
        inPatient.getTreatmentPlan();

        outPatient.setName("Yulan Fritz");
        outPatient.setAge(86);
        outPatient.setappointmentDate("March 16th 2028");
        outPatient.getTreatmentPlan();
    }
}
