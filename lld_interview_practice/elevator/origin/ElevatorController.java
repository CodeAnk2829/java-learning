package elevator.origin;

import elevator.origin.utils.RequestType;
import elevator.origin.utils.Direction;

public class ElevatorController {
    private Elevator[] elevators;

    // first algorithm --> bad experience
    private Elevator findNearestElevator(Request request) {
        int stop = request.getFloor();
        Elevator e = this.elevators[0];
        int minDistance = Math.abs(e.getCurrFloor() - stop);
        Elevator nearestElevator = e;

        for(int i = 1; i < 3; i++) {
            int distanceFromElevator = Math.abs(this.elevators[i].getCurrFloor() - stop);
            if(distanceFromElevator < minDistance) {
                minDistance = distanceFromElevator;
                nearestElevator = this.elevators[i];
            }
        }

        return nearestElevator;
    }

    // Good but basic
    private Elevator findMovingToward(Request request) {
        int floor = request.getFloor();
        Direction direction = (request.getRequestType() == RequestType.PICKUP_UP) ? Direction.UP : Direction.DOWN;
        Elevator nearest = null;
        int minDistance = Integer.MAX_VALUE;

        for(Elevator e : this.elevators) {
            if(e.getCurrDirection() != direction)
                continue;

            if((e.getCurrDirection() == Direction.UP && e.getCurrFloor() > floor)
            || (e.getCurrDirection() == Direction.DOWN && e.getCurrFloor() < floor))
                continue;

            int distance = Math.abs(e.getCurrFloor() - floor);
            if(distance < minDistance) {
                minDistance = distance;
                nearest = e;
            }
        }  
        return nearest;      
    }

    // similar to findMovingToward
    private Elevator findNearestIdle(Request request) {
        int floor = request.getFloor();
        Elevator nearest = null;
        int minDistance = Integer.MAX_VALUE;

        for(Elevator e : this.elevators) {
            if(e.getCurrDirection() != Direction.IDLE)
                continue;
            int distance = Math.abs(e.getCurrFloor() - floor);
            if(distance > minDistance) {
                minDistance = distance;
                nearest = e;
            } 
        }
        return nearest;
    }

    private Elevator selectBestElevator(Request request) {
        Elevator elevatorToDispatch = findMovingToward(request);
        if(elevatorToDispatch != null)
            return elevatorToDispatch;

        elevatorToDispatch = findNearestIdle(request);
        if(elevatorToDispatch != null) 
            return elevatorToDispatch;

        elevatorToDispatch = findNearestElevator(request);

        return elevatorToDispatch;
    }

    public ElevatorController() {
        for(int i = 0; i < 3; i++) {
            this.elevators[i] = new Elevator();
        }
    }

    public boolean handleRequest(int floor, RequestType type) {
        if((floor < 0 && floor > 9)
        || (type == RequestType.DESTINATION))
            return false; // only hall calls allowed

        // pickup algorithm
        Request request = new Request(floor, type);
        Elevator elevatorToDispatch = selectBestElevator(request);
        return elevatorToDispatch.addRequest(request);
    }
}
