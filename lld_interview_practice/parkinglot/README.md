# Parking Lot

## Requirements
1. System would allow 3 types of vehicles: 
    - Motorcycle -> Small
    - Car -> Medium
    - Suv/Van -> Large
2. System would assign an available compatible spot automatically based on vehicle type.
3. System would issue a ticket to the customer at the time of entry.
4. Pricing calculation will be done on hourly basis (rounded-up).
5. System validates ticket upon exit
    - Throw an error if someone tries to use an invalid ticket or used ticket
    - Frees the spot if a vehicle exits
6. System would reject entry if the lot is full

## Out of Scope
- Hardware controls such as gates
- Survilliance cameras
- UI/displays
- Payment processing system
- Reservation or pre-booking
- Lost ticket handling

## Core Entities & Relationships
- **ParkingLotSystem:** -> It's an orchestrator which keep tracks of the whole system. It holds the available and assigned spots, generate and issue tickets, validate tickets, calculate fees at exit. So this is the public API. 
- **Ticket:** -> It manages a record of parking session. It holds an ticket ID, which spot is assigned, vehicle type and entry time.
- **ParkingSpot:** This is a clear entity as it holds an ID, a type to match with the vehicle type, needs to track whether its occupied and have behaviour such as mark itself as occupied or free

## Class Design
```
class ParkingLot:
    - spots: List<ParkingSpot>
    - occupiedSpots: Set<ParkingSpot>
    - activeTickets: Map<String, Ticket>
    - hourlyRent: long

    + ParkingLotSystem(spots, hourlyRent)
    + enter(vehicleType) -> String | Error
    + exit(ticketId) -> boolean | Error
    + calculateFees() -> long

class ParkingSpot:
    - id: String
    - type: SpotType

    # - occupied: boolean # This is not an optimal solution as it is a relational property -> see hellointerview for more info

    + ParkingSpot(id, type)
    + getId() -> String
    + getSpotType() -> SpotType

class Ticket: 
    - id: String
    - spotId: String
    - vehicleType: VehicleType
    - entryTime: Timestamp

    + Ticket(id, spotId, vehicleType, entryTime)
    + getTicketId() -> String
    + getSpotId() -> String
    + getVehicleType() -> VehicleType
    + getEntryTime() -> Timestamp

enum SpotType: 
    MOTORCYCLE, 
    CAR,
    LARGE

enum VehicleType: 
    MOTORCYCLE, 
    CAR,
    LARGE
```