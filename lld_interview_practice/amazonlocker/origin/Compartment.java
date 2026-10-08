package amazonlocker.origin;

import amazonlocker.origin.utils.Size;

public class Compartment {
    private Size size;
    private boolean occupied;

    public Compartment(Size size) {
        this.size = size;
        this.occupied = false;
    }

    public Size getSize() {
        return this.size;
    }

    public boolean isOccupied() {
        return this.occupied;
    }

    public void markOccupied() {
        this.occupied = true;
    }

    public void markFree() {
        this.occupied = false;
    }

    public void open() {
        // hardware signal would be sent to the compartment..don't need to implement this one
        System.out.println("This compartment has been opened");
    }
}
