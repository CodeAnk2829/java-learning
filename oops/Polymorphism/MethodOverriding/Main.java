package oops.Polymorphism.MethodOverriding;

/*
NOTES:
- The access modifier of the overriding method must be the same as or less restrictive
  than the access modifier of the overridden method in the superclass. Specifically, 
  a method declared as public in the superclass can be overridden as public or protected 
  but not as private. Similarly, a method declared as protected in the superclass can be 
  overridden as protected or public but not as private. A method declared as default 
  (package-private) in the superclass can be overridden with default, protected, or public, but not as private.
- Methods declared as final in the superclass cannot be overridden in the subclass.
  Because final methods cannot be modified or extended.
- Static methods in Java are resolved at compile time and cannot be overridden. 
  Instead, they are hidden in the subclass if a method with the same signature is defined in the subclass.
*/

class Bank {
    double getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    double getRateOfInterest() {
        return 8;
    }
}

class AXIS extends Bank {
    double getRateOfInterest() {
        return 7;
    }
}

class ICICI extends Bank {
    double getRateOfInterest() {
        return 6.5;
    }
}

public class Main {
    public static void main(String args[]) {
        SBI sbi = new SBI();
        AXIS axis = new AXIS();
        ICICI icici = new ICICI();

        System.out.println(sbi.getRateOfInterest());
        System.out.println(axis.getRateOfInterest());
        System.out.println(icici.getRateOfInterest());
    }
}
