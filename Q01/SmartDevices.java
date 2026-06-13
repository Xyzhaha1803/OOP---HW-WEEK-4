/* Create a base class SmartDevice with fields: brand, model, and methods turnOn() and turnOff().
Create subclasses: SmartPhone and SmartWatch.
Override turnOn() and turnOff() in both subclasses to show device-specific behavior.
Instantiate devices and call their methods to demonstrate runtime polymorphism.
File: SmartDevices.java. */

class SmartDevice{
    public String brand;
    public String model;

    SmartDevice(String b, String m){
        this.brand = b;
        this.model = m;
    }

    void turnOn(){
        System.out.println(model + " Is on!");
    }

    void turnOff(){
        System.out.println(model + " Is off!");
    }
}

class SmartPhone extends SmartDevice{
    SmartPhone(String b, String m) {
        super(b, m);
    }

    @Override
    void turnOn(){
        System.out.println(model + " Is on!");
    }

    @Override
    void turnOff(){
        System.out.println(model + " Is off!");
    }
}

class SmartWatch extends SmartDevice{
    SmartWatch(String b, String m){
        super(b, m);
    }

    @Override
    void turnOn(){
        System.out.println(model + " Is on!");
    }

    @Override
    void turnOff(){
        System.out.println(model + " Is off!");
    }
}

public class SmartDevices {
    public static void main(String[] args){
        SmartDevice Device = new SmartDevice("Generic", "Phone");
        SmartPhone Phone = new SmartPhone("Apple", "Iphone 11");
        SmartWatch Watch = new SmartWatch("Apple", "Apple Watch S3");

        Device.turnOn();
        Device.turnOff();

        Phone.turnOn();
        Phone.turnOff();

        Watch.turnOn();
        Watch.turnOff();
    }
}
