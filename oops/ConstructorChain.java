package oops;

// this program demonstrate constructor chaining using **this** keyword

class Employee {
    static int count = 0;
    int employeeId;
    String name;
    int age;
    String address;

    Employee(String name, int age) {
        this.employeeId = ++count;
        this.name = name;
        this.age = age;
    }

    Employee(String name, int age, String address) {
        this(name, age); // constructor chaining
        this.address = address;
    }

    void displayInfo() {
        System.out.println("EmployeeId: " + this.employeeId);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + age);
        if(this.address != null) {
            System.out.println("Address: " + this.address);
        }
        System.out.printf("\n");
    }
}

public class ConstructorChain {
    public static void main(String... args) {
        Employee e1 = new Employee("Ankit", 24);
        Employee e2 = new Employee("Himanshu", 22, "Madhya Pradesh");

        e1.displayInfo();
        e2.displayInfo();
    }
}
