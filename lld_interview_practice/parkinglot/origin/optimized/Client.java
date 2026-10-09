package parkinglot.origin.optimized;

import java.util.ArrayList;
import java.util.List;

import parkinglot.origin.utils.SpotType;
import parkinglot.origin.utils.VehicleType;

public class Client {
    public static void main(String[] args) {
        ParkingSpot spot1 = new ParkingSpot("A", SpotType.SMALL);
        ParkingSpot spot2 = new ParkingSpot("B", SpotType.SMALL);
        ParkingSpot spot3 = new ParkingSpot("C", SpotType.SMALL);
        ParkingSpot spot4 = new ParkingSpot("D", SpotType.MEDIUM);
        ParkingSpot spot5 = new ParkingSpot("E", SpotType.MEDIUM);
        ParkingSpot spot6 = new ParkingSpot("F", SpotType.LARGE);

        List<ParkingSpot> spots = new ArrayList<>();
        spots.add(spot1);
        spots.add(spot2);
        spots.add(spot3);
        spots.add(spot4);
        spots.add(spot5);
        spots.add(spot6);

        long hourlyRate = 50;
        ParkingLot lot = new ParkingLot(spots, hourlyRate);
        Ticket t1 = lot.enter(VehicleType.CAR);
        Ticket t2 = lot.enter(VehicleType.MOTORCYCLE);
        Ticket t3 = lot.enter(VehicleType.MOTORCYCLE);
        Ticket t4 = lot.enter(VehicleType.CAR);
        Ticket t5 = lot.enter(VehicleType.SUV);
        Ticket t6 = lot.enter(VehicleType.MOTORCYCLE);
        t1.show();
        t2.show();
        t3.show();
        t4.show();
        t5.show();
        t6.show();

        long parkingCharges = lot.exit(t1.getId());
        System.out.println("Charges: " + parkingCharges + "\n");
        t1 = lot.enter(VehicleType.CAR);
        t1.show();

    }
}
