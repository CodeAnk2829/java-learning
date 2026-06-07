package oops.Polymorphism.MethodOverriding;

/*
- In this process, an overridden method is invoked using a superclass reference 
variable that refers to a subclass object. The method that gets executed is determined 
by the actual object being referred to, not by the reference type.

- Member variables cannot be overriden
*/

class Bank {
    String name = "Any";
    float getRateOfInterest() {
        return 0.0f;
    }
}

class SBI extends Bank {
    String name = "SBI";
    float getRateOfInterest() {
        return 8.8f;
    }
}

class ICICI extends Bank {
    String name = "ICICI";
    float getRateOfInterest() {
        return 9.8f;
    }
}

class AXIS extends Bank {
    String name = "AXIS";
    float getRateOfInterest() {
        return 9.0f;
    }
}

public class RuntimePolymorphism {
    public static void main(String args[]) {
        Bank b;
        b = new SBI();
        System.out.println("Rate of interest for SBI: " + b.getRateOfInterest());

        b = new ICICI();
        System.out.println("Rate of interest for ICICI: " + b.getRateOfInterest());

        b = new AXIS();
        System.out.println("Rate of interest for AXIS: " + b.getRateOfInterest());

        System.out.println(b.name); // This will always print parent's member variable
    }
}
