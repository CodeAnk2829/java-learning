package parkinglot.origin.naive;

import parkinglot.origin.utils.SpotType;

public class ParkingSpot {
    private String id;
    private SpotType spotType;
    private boolean occupied; // this has been kept in the naive way --> see the intermediate way to avoid keeping this one

    public ParkingSpot(String id, SpotType spotType) {
        this.id = id;
        this.spotType = spotType;
        this.occupied = false;
    }

    public String getId() {
        return this.id;
    }

    public SpotType getSpotType() {
        return this.spotType;
    }

    public boolean isOccupied() {
        return this.occupied;
    }

    public void markOccupied() {
        this.occupied = true;
    }

    public void markFree() {
        this.occupied = false;
    }
}