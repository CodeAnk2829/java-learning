package oops.Abstraction.Interface;

/*
- An interface is a blueprint of a class that contains static constants and abstract methods. 
Interfaces are used to achieve abstraction. An interface contains only abstract methods 
(methods without a body) and variables. It cannot be instantiated, similar to an abstract class, 
and represents an IS-A relationship.

- interface methods are public and abstract by default, while interface fields are public, static, and final by default.
*/

interface Vehicle {
    void run();
    void sound();
}

class Car implements Vehicle {
    public void run() {
        System.out.println("The car is running...");
    }

    public void sound() {
        System.out.println("Whroom Whroom...");
    }
}

public class Example1 {
    public static void main(String args[]) {
        Vehicle v = new Car();
        v.run();
        v.sound();
    }
}
