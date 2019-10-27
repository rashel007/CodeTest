package Task2.FacrotyPattern;

public class Plane implements Vehicle {

    private int totalwheels;
    private int totalPassengers;
    private boolean hasGas;

    Plane(int totalwheels, int totalPassengers, boolean hasGas) {
        this.totalwheels = totalwheels;
        this.totalPassengers = totalPassengers;
        this.hasGas = hasGas;
    }


    @Override
    public int get_num_of_wheels() {
        return totalwheels;
    }

    @Override
    public int get_num_of_passengers() {
        return totalPassengers;
    }

    @Override
    public boolean has_gas() {
        return hasGas;
    }
}
