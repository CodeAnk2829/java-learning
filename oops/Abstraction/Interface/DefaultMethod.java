package oops.Abstraction.Interface;

/*
Since Java 8, we can have method body in interface. But we need to make it default method.
*/

interface Drawable {
    void draw();
    default void msg() {
        System.out.println("Msg: This is default method inside an interface");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing rectangle...");
    }
    // no need to implement default method
    // public void msg() {
    //     System.out.println("Msg: This is public method inside Rectangle class");
    // }
}

public class DefaultMethod {
    public static void main(String args[]) {
        Drawable d = new Rectangle();
        d.draw();
        d.msg();

        Rectangle r = new Rectangle();
        r.draw();
        r.msg();
    }
}
