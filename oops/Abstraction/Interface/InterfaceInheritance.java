package oops.Abstraction.Interface;

// inheritence of interfaces

interface Person {
    void work();
}

interface Employee extends Person {
    void create();
}

class Programmer implements Employee {
    public void work() {
        System.out.println("Working...");
    }

    public void create() {
        System.out.println("Creating an application...");
    }
}

public class InterfaceInheritance {
    public static void main(String args[]) {
        Programmer p = new Programmer();
        p.work();
        p.create();
    }
}
