package Task2.BuilderPattern;

public class Simulate {

    public static void main(String[] args) {
        VehicleBuilder carBuilder = new CarBuilder();
        VehicleBuilder planeBuilder = new PlaneBuilder();

        VehicleManufacturer vm = new VehicleManufacturer();

        Vehicle car = vm.createVehicle(carBuilder);
        Vehicle plane = vm.createVehicle(planeBuilder);

        System.out.println(car);
        System.out.println(plane);
    }
}
