// Compressor component
class Compressor {
    public void start() {
        System.out.println("Compressor started");
    }

    public void stop() {
        System.out.println("Compressor stopped");
    }
}

// CoolingSystem component
class CoolingSystem {
    public void cool() {
        System.out.println("Cooling system activated");
    }
}

// Thermostat component
class Thermostat {
    private int temperature;

    public Thermostat(int temperature) {
        this.temperature = temperature;
    }

    public void regulateTemperature() {
        System.out.println("Thermostat regulating temperature to " + temperature + "°C");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to " + temperature + "°C");
    }
}

// Light component
class Light {
    public void turnOn() {
        System.out.println("Light turned on");
    }

    public void turnOff() {
        System.out.println("Light turned off");
    }
}

// Refrigerator composed of multiple components
class Refrigerator {
    private Compressor compressor;
    private CoolingSystem coolingSystem;
    private Thermostat thermostat;
    private Light light;

    public Refrigerator(int initialTemp) {
        compressor = new Compressor();
        coolingSystem = new CoolingSystem();
        thermostat = new Thermostat(initialTemp);
        light = new Light();
    }

    public void start() {
        light.turnOn();
        compressor.start();
        coolingSystem.cool();
        thermostat.regulateTemperature();
        System.out.println("Refrigerator is running");
    }

    public void stop() {
        compressor.stop();
        light.turnOff();
        System.out.println("Refrigerator is stopped");
    }

    public void setTemperature(int temp) {
        thermostat.setTemperature(temp);
    }
}

public class RefrigeratorDemo {
    public static void main(String[] args) {
        Refrigerator fridge = new Refrigerator(4);
        fridge.start();

        System.out.println("--- Changing temperature ---");
        fridge.setTemperature(2);

        fridge.stop();
    }
}
