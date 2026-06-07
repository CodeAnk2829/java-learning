package oops.Abstraction.Abstraction;

/*
Abstraction is the process of hiding implementation details and showing
only the required functionality to the user. In other words, it displays 
only the essential features while hiding internal details
*/

abstract class Vehicle {
    abstract void run();
    void displayInfo() {
        System.out.println("This is Vehicle class");
    }
}

class Car extends Vehicle {
    void run() { // the implementation for the abstract class must be given inside the subclass
        System.out.println("Car is running...");
    }
}

public class Main {
    public static void main(String args[]) {
        // Vehicle v = new Vehicle(); // Object for an abstract class cannot be created
        Car c = new Car();
        c.run();
        c.displayInfo();
    }
}
