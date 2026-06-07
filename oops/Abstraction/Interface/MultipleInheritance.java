package oops.Abstraction.Interface;

interface Printable {
    void getData();
    void print();
}

interface Showable {
    void getData();
    void show();
}

class Computer implements Printable, Showable {
    public void getData() {
        System.out.println("Computer data");
    }

    public void print() {
        System.out.println("Printing data...");
    }

    public void show() {
        System.out.println("Showing data...");
    }
}

public class MultipleInheritance {
    public static void main(String args[]) {
        Computer c = new Computer();
        c.getData();
        c.print();
        c.show();
    }
}
