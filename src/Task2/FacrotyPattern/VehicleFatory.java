package Task2.FacrotyPattern;

public class VehicleFatory {

    Vehicle getVehicle(VehicleType type, int wheel, int passengers, boolean hasGas) {

        switch (type) {
            case CAR:
                return new Car(wheel, passengers, hasGas);
            case PLANE:
                return new Plane(wheel, passengers, hasGas);
            default:
                throw new NullPointerException("Couldn't found VehicleType");
        }
    }
}
