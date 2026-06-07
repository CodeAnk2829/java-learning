package oops.Aggregation;

class Address {
    String city;
    String state;
    String country;
    String pincode;

    Address(String city, String state, String country, String pincode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    String getAddress() {
        return String.join(", ", this.city, this.country, this.pincode);
    }
}

class Employee {
    static int count = 0;
    int id;
    String name;
    int age;
    Address address;

    Employee(String name, int age, Address address) {
        this.id = ++count;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void displayInfo() {
        System.out.println("EmployeeId: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address.getAddress());
        System.out.printf("\n");
    }
}
public class Example2 {
    public static void main(String args[]) {
        Address add1 = new Address("Gaya", "Bihar", "India", "824205");
        Address add2 = new Address("Noida", "Uttar Pradesh", "India", "201301");

        Employee e1 = new Employee("Ankit", 24, add1);
        Employee e2 = new Employee("Himanshu", 23, add2);

        e1.displayInfo();
        e2.displayInfo();
    }
}
