package parkinglot.origin.naive;

import java.time.LocalDateTime;

import parkinglot.origin.utils.VehicleType;

public class Ticket {
    private String id;
    private VehicleType vehicleType;
    private ParkingSpot assignedSpot;
    private LocalDateTime entryTime;

    public Ticket(String id, VehicleType vehicleType, ParkingSpot assignedSpot) {
        this.id = id;
        this.vehicleType = vehicleType;
        this.assignedSpot = assignedSpot;
        this.entryTime = LocalDateTime.now();
    }

    public String getTicketId() {
        return this.id;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public ParkingSpot getAssignedSpot() {
        return this.assignedSpot;
    }

    public LocalDateTime getEntryTime() {
        return this.entryTime;
    } 

    public void show() {
        System.out.println("ID: " + this.getTicketId());
        System.out.println("VehicleType: " + this.getVehicleType());
        System.out.println("Assigned Spot: " + this.getAssignedSpot().getId());
        System.out.println("Entry Time: " + this.getEntryTime() + "\n");
    }
}
