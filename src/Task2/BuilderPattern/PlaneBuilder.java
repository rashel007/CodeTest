package Task2.BuilderPattern;

public class PlaneBuilder extends VehicleBuilder {

    Vehicle plane = new Vehicle();

    @Override
    public void set_num_of_wheels() {
        plane.setWheels(3);
    }

    @Override
    public void set_num_of_passengers() {
        plane.setPassengers(100);
    }

    @Override
    public void has_gas() {
        plane.setGas(false);
    }

    @Override
    public Vehicle getVehicle() {
        return plane;
    }
}
