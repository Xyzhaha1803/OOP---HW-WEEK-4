/* Create base class Vehicle:
Fields: plateNumber, baseRate
Method: calculateRental(int days)
Subclasses:
Car: charges baseRate * days
Truck: charges baseRate * days + load fee
Bike: fixed rate regardless of days
Override calculateRental() to reflect different pricing models.
File: VehicleRental.java. */

class Vehicle{
    public int plateNumber;
    public double baseRate;

    public void setPlateNumber(int pn){
        this.plateNumber = pn;
    }

    public int getPlateNumber(){
        return plateNumber;
    }

    public void setBaseRate(double br){
        this.baseRate = br;
    }

    public double getBaseRate(){
        return baseRate;
    }

    public void calculateRental(int days){
        System.out.println("Price to be paid: " + (days * baseRate));
    }
}

class Car extends Vehicle{
    @Override
    public void calculateRental(int d){
        System.out.println("Price to be paid: " + (baseRate * d));
    }
    
}

class Truck extends Vehicle{
    @Override
    public void calculateRental(int d){
        System.out.println("Price to be paid: " + ((baseRate * d) + 500));
    }
    
}

class Bike extends Vehicle{
    @Override
    public void calculateRental(int d){
        System.out.println("Price to be paid: " + baseRate);
    }
    
}

public class VehicleRental {
    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck();
        Bike bike = new Bike();

        car.setBaseRate(150);
        truck.setBaseRate(200);
        bike.setBaseRate(25);

        car.calculateRental(10);
        truck.calculateRental(15);
        bike.calculateRental(3);
    }
}
