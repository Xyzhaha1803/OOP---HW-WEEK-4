/* Class Device: field deviceName, method operate()
Subclasses:
Light: operate() turns on light
Thermostat: operate() sets temperature
SecurityCamera: operate() starts recording
Demonstrate polymorphism using a Device[] list.
File: SmartHomeSystem.java */

class Device {
    public String deviceName;

    public Device(String dN){
        this.deviceName = dN;
    }

    public void operate(){
        System.out.println("Operation started----------------");
        System.out.println("Device Name: " + deviceName);
    }
}

class Light extends Device {
    public Light(String dN){
        super(dN);
    }

    @Override
    public void operate(){
        super.operate();
        System.out.println("Light turned on.");
    }
}

class Thermostat extends Device {
    public Thermostat(String dN){
        super(dN);
    }

    @Override
    public void operate(){
        super.operate();
        System.out.println("Setting Temperature.");
    }
}

class SecurityCamera extends Device {
    public SecurityCamera(String dN){
        super(dN);
    }

    @Override
    public void operate(){
        super.operate();
        System.out.println("Recording started.");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        Device[] devices = new Device[3];

        devices[0] = new Light("Ceiling Light");
        devices[1] = new Thermostat("Generic Thermostat");
        devices[2] = new SecurityCamera("Advanced Security Camera");

        for(int i = 0; i < devices.length; i++){
            devices[i].operate();
        }
    }
}
