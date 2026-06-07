package oops.Polymorphism.MethodOverriding;

/*
- The super keyword is a reference variable used to refer to the immediate parent class object. 
Whenever you create an instance of a subclass, an instance of the parent class is created implicitly, 
which is accessed using the super reference variable.
*/

class Person {
    String name;
    int age;
    String color = "white";

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void learnComputer() {
        System.out.println("Person: Learning how computers work...");
    }
}

class Employee extends Person {
    String color;

    Employee(String name, int age, String color) {
        super(name, age); // use super keyword for constructor chaining
        this.color = color;
    }

    void learnComputer() {
        System.out.println("Employee: Learning a new computer programming language...");
    }

    void status() {
        System.out.println("Person is of color " + super.color); // use super keyword to access the field of superclass
        System.out.println("But employee is of color " + this.color);
        super.learnComputer(); // use super keyword to access the method defined inside superclass
        this.learnComputer();
    }
}
public class SuperKeyword {
    public static void main(String args[]) {
        Employee e = new Employee("Ankit", 24, "Brown");
        e.status();
    }
}
