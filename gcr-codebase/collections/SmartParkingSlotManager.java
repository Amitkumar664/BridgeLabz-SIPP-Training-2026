import java.util.ArrayList;

public class SmartParkingSlotManager {

    ArrayList<String> vehicles = new ArrayList<>();

    // Add Vehicle
    public void addVehicle(String regNo) {
        if (vehicles.contains(regNo)) {
            System.out.println("Vehicle is already parked.");
        } else {
            vehicles.add(regNo);
            System.out.println("Vehicle Entered: " + regNo);
        }
    }

    // Remove Vehicle
    public void removeVehicle(String regNo) {
        if (vehicles.remove(regNo)) {
            System.out.println("Vehicle Exited: " + regNo);
        } else {
            System.out.println("Vehicle Not Found.");
        }
    }

    // Search Vehicle
    public void searchVehicle(String regNo) {
        if (vehicles.contains(regNo)) {
            System.out.println("Vehicle is currently parked.");
        } else {
            System.out.println("Vehicle is not parked.");
        }
    }

    // Display All Vehicles
    public void displayVehicles() {
        System.out.println("\nParked Vehicles:");
        if (vehicles.isEmpty()) {
            System.out.println("Parking is Empty.");
        } else {
            for (String vehicle : vehicles) {
                System.out.println(vehicle);
            }
        }
        System.out.println("Total Occupied Parking Slots: " + vehicles.size());
    }

    public static void main(String[] args) {

        SmartParkingSlotManager parking = new SmartParkingSlotManager();

        parking.addVehicle("UP32AB1234");
        parking.addVehicle("DL01CD5678");
        parking.addVehicle("HR26EF9012");

        parking.searchVehicle("DL01CD5678");

        parking.removeVehicle("UP32AB1234");

        parking.displayVehicles();
    }
}
