
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> vehReg;

    public VehicleRegistry() {
        this.vehReg = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.vehReg.containsKey(licensePlate)) {
            this.vehReg.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return this.vehReg.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.vehReg.containsKey(licensePlate)) {
            this.vehReg.remove(licensePlate);
            return true;
        }
        return false;
    }

     public void printLicensePlates() {
        for (LicensePlate plate : this.vehReg.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();

        for (String owner : this.vehReg.values()) {
            if (owners.contains(owner)){
                continue;
            }
            System.out.println(owner);
            owners.add(owner);
        }
    }
}