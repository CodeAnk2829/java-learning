package oops.Abstraction.Interface;

interface Bank {
    float getRateOfInterest();
}

class SBI implements Bank {
    public float getRateOfInterest() {
        return 8.9f;
    }
}

class ICICI implements Bank {
    public float getRateOfInterest() {
        return 9.0f;
    }
}

class AXIS implements Bank {
    public float getRateOfInterest() {
        return 8.5f;
    }
}

public class Example2 {
    public static void main(String args[]) {
        Bank b;
        b = new SBI();
        System.out.println("The rate of interest of SBI: " + b.getRateOfInterest());

        b = new ICICI();
        System.out.println("The rate of interest of ICICI: " + b.getRateOfInterest());

        b = new AXIS();
        System.out.println("The rate of interest of AXIS: " + b.getRateOfInterest());
    }
}
