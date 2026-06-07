package oops;

class Student {
    int id;
    int age;
    String name;
    static String college = "MANIT";
    static int count = 0;

    Student(String name) {
        this.id = ++count;
        this.name = name;
        // college = "MANIT"; // shouldn't be assigned here
    }

    Student(String name, int age) {
        this.id = ++count;
        this.name = name;
        this.age = age;
    }

    void printDetails() {
        System.out.println("id: " + this.id + ", name: " + this.name + ", age: " + this.age + " studying in " + college);
        // NOTE: static variable **should not** be accessed using this keyword as they are not related to a particular object
    }
    static String getCollege() {
        // System.out.println(id); // non-static variables cannot be accesses inside static methods
        return college;
    }
}

public class Main {
    int num; // thi non-static variable cannot be accessed inside the `main` method
    public static void main(String[] args) {
        // Student s = new Student(); // Error: Student didn't have a default constructor
        Student s1 = new Student("Ankit");
        Student s2 = new Student("Himanshu", 21);

        s1.printDetails();
        s2.printDetails();
        
        // print instance variables
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.age);

        // print static variable
        System.out.println(Student.college);
        
        // see the behaviour of static variables

        // print the static variable using instances
        System.out.println(s1.college);
        System.out.println(s2.college);

        // change the static variable through one instance
        s1.college = "NIT Bhopal";
        
        // see if the static variable is shared among the objects of Student class
        // if it is then changing the value of static variable via an object
        // and then accessing it via another object or classname would also 
        // change the actual static variable
        System.out.println(s2.college);
        System.out.println(Student.college);
    } 
}
