package elevator.origin;

import java.util.Set;
import java.util.HashSet;
import elevator.origin.utils.Direction;

public class Elevator {
    private int currentFloor;
    private Direction direction;
    private Set<Request> requests;

    public Elevator() {
        this.currentFloor = 0;
        this.direction = Direction.UP;
        this.requests = new HashSet<Request>();
    }

    public boolean addRequest(Request request) {
        requests.add(request);
        return true;
    }

    public void step() {

    }

    public int getCurrFloor() {
        return this.currentFloor;
    }

    public Direction getCurrDirection() {
        return this.direction;
    }
}
