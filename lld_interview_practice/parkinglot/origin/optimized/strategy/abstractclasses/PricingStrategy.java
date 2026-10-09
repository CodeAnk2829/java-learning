package parkinglot.origin.optimized.strategy.abstractclasses;

public interface PricingStrategy {
    long calculateFee(long entryTime, long exitTime);
}
