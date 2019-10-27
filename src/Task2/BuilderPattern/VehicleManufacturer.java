package Task2.BuilderPattern;

public class VehicleManufacturer {

    public Vehicle createVehicle(VehicleBuilder builder) {
        builder.has_gas();
        builder.set_num_of_passengers();
        builder.set_num_of_wheels();
        return builder.getVehicle();
    }
}
