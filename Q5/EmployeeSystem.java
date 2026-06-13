/* Base class Employee with private fields name, id, and method calculateSalary().
Subclasses:
Manager with bonus
Developer with overtimeHours
Use encapsulation for fields and override calculateSalary():
For Manager, salary = base + bonus
For Developer, salary = base + overtimeHours * rate
File: EmployeeSystem.java. */

class Employee{
    private String name;
    private int id;

    public void calculateSalary(double base){
        System.out.println("Salary: X" + base);
    }
}

class Manager extends Employee{
    private double bonus;

    public void setBonus(double b){
        this.bonus = b;
    }

    public double getBonus(){
        return bonus;
    }

    @Override
    public void calculateSalary(double base){
        System.out.println("Salary: " + (base + getBonus()));
    }
}

class Developer extends Employee{
    private double overtimeHours;

    public void setOvertime(double b){
        this.overtimeHours = b;
    }

    public double getOvertime(){
        return overtimeHours;
    }

    @Override
    public void calculateSalary(double base){
        System.out.println("Salary: " + (base + (getOvertime() * 45) ) );
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Developer developer = new Developer();

        manager.setBonus(5000);
        developer.setOvertime(12);

        manager.calculateSalary(75000);
        developer.calculateSalary(50000);
    }
}
