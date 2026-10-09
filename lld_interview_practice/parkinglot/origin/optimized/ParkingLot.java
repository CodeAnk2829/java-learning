package parkinglot.origin.optimized;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import parkinglot.origin.optimized.strategy.abstractclasses.PricingStrategy;
import parkinglot.origin.optimized.strategy.concreteclasses.HourlyPricing;
import parkinglot.origin.utils.SpotType;
import parkinglot.origin.utils.VehicleType;

public class ParkingLot {
    private List<ParkingSpot> spots;
    private Set<String> occupiedSpotIds;
    private Map<String, Ticket> activeTickets;
    private long hourlyRent;

    public ParkingLot(List<ParkingSpot> spots, long hourlyRent) {
        this.spots = spots;
        this.occupiedSpotIds = new HashSet<>();
        this.activeTickets = new HashMap<>();
        this.hourlyRent = hourlyRent;
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
                throw new RuntimeException("Unknown vehicle type");
        }
    }

    private ParkingSpot findAvailableCompatibleSpot(VehicleType vehicleType) {
        SpotType requiredType = getCompatibleSpotType(vehicleType);
        for(ParkingSpot spot : this.spots) {
            // find whether this spot is available and compatible with the given vehicleType
            if(!this.occupiedSpotIds.contains(spot.getId())
            && requiredType == spot.getSpotType()) {
                return spot;
            }   
        }
        return null;
    }

    public Ticket enter(VehicleType vehicleType) {
        ParkingSpot availableSpot = findAvailableCompatibleSpot(vehicleType);
        if(availableSpot == null) 
            throw new RuntimeException("No spots available for vehicle type" + vehicleType);
        
        // mark the availableSpot as occupied by adding it into the occupied set
        this.occupiedSpotIds.add(availableSpot.getId());

        String ticketId = UUID.randomUUID().toString();
        long entryTime = System.currentTimeMillis();

        // below three instructions must be atomic
        Ticket ticket = new Ticket(ticketId, availableSpot.getId(), vehicleType, entryTime);
        this.activeTickets.put(ticketId, ticket);
        return ticket;
    }

    public long exit(String ticketId) {
        /*
            - Check whether the ticket is valid -> check the existence in the lookup
            - Find parking session -> time spent
            - Calculate fare based on the time spent
            - Release the ticket -> free the spot
        */

        if(ticketId == null)
            throw new RuntimeException("Invalid ticketId");

        if(!this.activeTickets.containsKey(ticketId))
            throw new RuntimeException("Invalid ticket");

        Ticket ticket = this.activeTickets.get(ticketId);
        long entryTime = ticket.getEntryTime();
        long exitTime = System.currentTimeMillis();

        // calculate fees using strategy pattern
        PricingStrategy pricingStrategy = new HourlyPricing(hourlyRent);
        long parkingCharges = pricingStrategy.calculateFee(entryTime, exitTime);

        // remove spotId from the set and the ticket to mark the spot as available
        String spotId = ticket.getSpotId();
        this.occupiedSpotIds.remove(spotId);
        this.activeTickets.remove(ticketId);

        return parkingCharges;
    }   
}
