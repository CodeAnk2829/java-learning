package parkinglot.origin.optimized.strategy.concreteclasses;

import parkinglot.origin.optimized.strategy.abstractclasses.PricingStrategy;

public class HourlyPricing implements PricingStrategy {
    private long hourlyRent;
    
    public HourlyPricing(long hourlyRent) {
        this.hourlyRent = hourlyRent;
    }

    public long calculateFee(long entryTime, long exitTime) {
        long durationInMillis = exitTime - entryTime;
        long spentHours = durationInMillis / (1000 * 60 * 60);
        // the nearest hour => even though a vehicle parked for 5 minutes it will be charged for 1 hour
        if(durationInMillis % (1000 * 60 * 60) > 0)
            spentHours++;
        
        return (long)(hourlyRent * spentHours);
    }
}
