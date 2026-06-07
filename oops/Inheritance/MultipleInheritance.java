package oops.Inheritance;

/* 
- Multiple inheritance through classes is not supported in java as it leads to diamond problem.
- If same method is being used inside different classes which has different implemenations and a third class is extending both the classes
  then an ambiguity will arise -> which class's method should be used via third class.
- Multiple inheritance in java can be implemented using interfaces because there is only one implementation of the same method
  which was the case in diamond problem, hence no ambiguity
*/

/*
- In java any method declared inside an interfae is implicitly public and abstract
- When you implement an interface in a class, Java enforces a strict rule: An overriding 
  method cannot have a more restrictive access modifier than the method it is overriding.
- void walk() method will have default access modifier which is more restrictive than public
- Hence any method to be implemented must have public visibility
 */

interface Mammal {
    void walk();
}

interface Pet {
    void walk();
}

class Dog implements Mammal, Pet {
    public void walk() { 
        System.out.println("Walking...");
    }
}
public class MultipleInheritance {
    public static void main() {
        Dog d = new Dog();
        d.walk();
    }
}
