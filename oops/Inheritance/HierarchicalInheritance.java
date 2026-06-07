package oops.Inheritance;

class Animal {
    void walk() {
        System.out.println("Walking....");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof Woof...");
    }
}

class Cat extends Animal {
    void say() {
        System.out.println("Meow Meow...");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("Rooooooaarrr...");
    }
}
public class HierarchicalInheritance {
    public static void main(String args[]) {
        Dog d = new Dog();
        Cat c = new Cat();
        Lion l = new Lion();

        d.walk();
        d.bark();
        c.walk();
        c.say();
        l.walk();
        l.roar();
    }


}
