package parkinglot.origin.optimized;

import parkinglot.origin.utils.SpotType;

public class ParkingSpot {
    private String id;
    private SpotType spotType; 

    // NOTE: occpancy is a relational property so it would be managed by the parkingLot system.

    public ParkingSpot(String id, SpotType spotType) {
        this.id = id;
        this.spotType = spotType;
    }

    public String getId() {
        return this.id;
    }

    public SpotType getSpotType() {
        return this.spotType;
    }
}
