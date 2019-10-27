package Task2.BuilderPattern;

public abstract class VehicleBuilder {

    public abstract void set_num_of_wheels();

    public abstract void set_num_of_passengers();

    public abstract void has_gas();

    public abstract Vehicle getVehicle();
}
