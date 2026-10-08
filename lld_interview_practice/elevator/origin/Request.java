package elevator.origin;

import elevator.origin.utils.RequestType;

public class Request {
    private int floor;
    private RequestType type;

    public Request(int floor, RequestType type) {
        this.floor = floor;
        this.type = type;
    }

    public int getFloor() {
        return this.floor;
    }

    public RequestType getRequestType() {
        return this.type;
    }
}
