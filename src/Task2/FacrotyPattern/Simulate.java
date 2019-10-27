package Task2.FacrotyPattern;

public class Simulate {

    public static void main(String[] args) {
        VehicleFatory fatory = new VehicleFatory();
        Vehicle myCarVehicle = fatory.getVehicle(VehicleType.CAR, 4, 4, true);
        Vehicle myPlaneVehicle = fatory.getVehicle(VehicleType.CAR, 3, 400, false);
    }
}
