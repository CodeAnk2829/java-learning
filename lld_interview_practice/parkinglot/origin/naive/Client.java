package parkinglot.origin.naive;

import java.util.ArrayList;
import java.util.List;

import parkinglot.origin.utils.SpotType;
import parkinglot.origin.utils.VehicleType;

public class Client {
    public static void main(String... args) {
        ParkingSpot spot1 = new ParkingSpot("1", SpotType.SMALL);
        ParkingSpot spot2 = new ParkingSpot("2", SpotType.SMALL);
        ParkingSpot spot3 = new ParkingSpot("3", SpotType.SMALL);
        ParkingSpot spot4 = new ParkingSpot("4", SpotType.MEDIUM);
        ParkingSpot spot5 = new ParkingSpot("5", SpotType.MEDIUM);
        ParkingSpot spot6 = new ParkingSpot("6", SpotType.LARGE);

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

        long parkingCharges = lot.exit(t1.getTicketId());
        System.out.println("Charges: " + parkingCharges + "\n");
        t1 = lot.enter(VehicleType.CAR);
        t1.show();
    }
}
