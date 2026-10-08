package parkinglot.origin.naive;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;

import parkinglot.origin.utils.SpotType;
import parkinglot.origin.utils.VehicleType;

public class ParkingLot {
    private List<ParkingSpot> spots;
    private Map<String, Ticket> activeTickets;
    private long hourlyRate;

    public ParkingLot(List<ParkingSpot> spots, long hourlyRate) {
        this.spots = spots;
        this.activeTickets = new HashMap<>();
        this.hourlyRate = hourlyRate;
    }

    private long calculateFee(Ticket ticket) {
        LocalDateTime currentTime = LocalDateTime.now();
        long durationInMinutes = Duration.between(ticket.getEntryTime(), currentTime).toMinutes();
        long totalHoursSpend = Math.round(durationInMinutes / 60.0);
        long parkingCharge = totalHoursSpend * this.hourlyRate;
        return parkingCharge;
    }

    // Naive approach -> dependent on occupied variable stored inside the ParkingSpot class
    private ParkingSpot findAvailableCompatibleSpot(VehicleType vehicleType) {
        SpotType requiredType = getCompatibleSpotType(vehicleType);

        for(ParkingSpot spot : spots) {
            if(spot.getSpotType() == requiredType && !spot.isOccupied()) {
                return spot;
            }
        }
        return null;
    }

    private SpotType getCompatibleSpotType(VehicleType vehicleType) {
        switch (vehicleType) {
            case VehicleType.MOTORCYCLE:
                return SpotType.SMALL;
            
            case VehicleType.CAR:
                return SpotType.MEDIUM;
            
            case VehicleType.SUV:
                return SpotType.LARGE;

            default:
                return null;
        }
    }

    public Ticket enter(VehicleType vehicleType) {
        // find the available compatible spot
        ParkingSpot availableSpot = findAvailableCompatibleSpot(vehicleType);

        if(availableSpot == null) {
            throw new RuntimeException("No spots available");
        }
        // mark the spot as occupied
        availableSpot.markOccupied();

        // issue a ticket
        String uuid = UUID.randomUUID().toString();
        Ticket ticket = new Ticket(uuid, vehicleType, availableSpot);
        this.activeTickets.put(uuid, ticket);
        return ticket;
    }

    public long exit(String ticketId) {
        // validate ticket
        if(!this.activeTickets.containsKey(ticketId))
            throw new RuntimeException("Invalid ticket");

        Ticket ticket = this.activeTickets.get(ticketId);

        // mark the spot free 
        ticket.getAssignedSpot().markFree();
        this.activeTickets.remove(ticketId);

        // calculate price
        return calculateFee(ticket);
    }
}
