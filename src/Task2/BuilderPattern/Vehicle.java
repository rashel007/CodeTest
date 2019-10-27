package Task2.BuilderPattern;

public class Vehicle {

    private int wheels;

    private int passengers;

    private boolean gas;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public boolean isGas() {
        return gas;
    }

    public void setGas(boolean gas) {
        this.gas = gas;
    }

    @Override
    public String toString() {
        return "Vehicle [wheels=]" + wheels + ", passengers=" + passengers + ", Gas=" + gas;
    }
}
