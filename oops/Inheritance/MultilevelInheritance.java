package oops.Inheritance;

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("woof woof");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("weeping...");
    }
}

public class MultilevelInheritance {
    public static void main(String args[]) {
        Puppy p = new Puppy();
        p.weep();
        p.bark();
        p.eat();
    }
}
