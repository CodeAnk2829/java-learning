package oops.Inheritance;

/*
- Inheritance -> Is-A relationship
- Child is a part of Parent
 */

class Employee {
    int employeeId;
    String name;
    int age;
    int salary;
    static int count = 0;

    Employee(String name, int age, int salary) {
        this.employeeId = ++count;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("EmployeeId: " + this.employeeId);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);
        System.out.printf("\n");
    }
}

class Programmer extends Employee {
    Programmer(String name, int age, int salary) {
        super(name, age, salary);
    }
}

public class SingleInheritance { // we can write different class name from the file name without using public before class
    public static void main(String args[]) {
        Programmer p = new Programmer("Ankit", 24, 10000000);
        p.displayInfo();
    }   
}