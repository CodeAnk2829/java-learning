package parkinglot.origin.optimized;

import parkinglot.origin.utils.VehicleType;

public class Ticket {
    private String id;
    private String spotId;
    private VehicleType vehicleType;
    private long entryTime;

    public Ticket(String id, String spotId, VehicleType vehicleType, long entryTime) {
        this.id = id;
        this.spotId = spotId;
        this.vehicleType = vehicleType;
        this.entryTime = entryTime;
    } 

    public String getId() {
        return this.id;
    }

    public String getSpotId() {
        return this.spotId;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public long getEntryTime() {
        return this.entryTime;
    }

    public void show() {
        System.out.println("ID: " + this.getId());
        System.out.println("VehicleType: " + this.getVehicleType());
        System.out.println("Assigned Spot: " + this.getSpotId());
        System.out.println("Entry Time: " + this.getEntryTime() + "\n");
    }
}

