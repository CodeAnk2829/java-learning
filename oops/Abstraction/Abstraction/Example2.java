package oops.Abstraction.Abstraction;

abstract class Bank {
    Bank() {
        System.out.println("A new Bank is created");
    }
    abstract float getRateOfInterest();
    void wihtdraw() {
        System.out.println("Withdrawing...");
    }
}

class SBI extends Bank {
    float getRateOfInterest() {
        return 8.5f;
    }
}

class ICICI extends Bank {
    float getRateOfInterest() {
        return 9.1f;
    }
}

class AXIS extends Bank {
    float getRateOfInterest() {
        return 8.9f;
    }
}

public class Example2 {
    public static void main(String args[]) {
        Bank b;
        b = new SBI();
        System.out.println("The rate of interset of SBI: " + b.getRateOfInterest());;

        b = new ICICI();
        System.out.println("The rate of interset of ICICI: " + b.getRateOfInterest());;

        b = new AXIS();
        System.out.println("The rate of interset of AXIS: " + b.getRateOfInterest());;
    }
}
