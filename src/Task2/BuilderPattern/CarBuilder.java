package Task2.BuilderPattern;

public class CarBuilder extends VehicleBuilder {

    Vehicle car = new Vehicle();

    @Override
    public void set_num_of_wheels() {
        car.setGas(true);
    }

    @Override
    public void set_num_of_passengers() {
        car.setPassengers(4);
    }

    @Override
    public void has_gas() {
        car.setWheels(4);
    }

    @Override
    public Vehicle getVehicle() {
        return car;
    }
}
