package oops.Abstraction.Interface;

/*
One of the main benefits of interfaces is that they support polymorphism. 
An interface reference can point to any object of a class that implements it. 
This allows the program to decide at runtime which method implementation to use.
*/

interface Animal {
    void eat();
    void sleep();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Eating...");
    }
    public void sleep() {
        System.out.println("Sleeping...");
    }
    void bark() {
        System.out.println("Barking...");
    }
}

public class InterfacePolymorphism {
    public static void main(String args[]) {
        Animal a = new Dog(); // Runtime polymorphism using runtime and depends on the object type
        a.eat();
        a.sleep();
        // a.bark(); Compile time error
    }
}