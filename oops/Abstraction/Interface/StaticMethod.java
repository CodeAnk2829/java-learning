package oops.Abstraction.Interface;

interface Shape {
    int getArea();
    static void showColor() {
        System.out.println("Color of all the shapes are blue.");
    }
}

class Square implements Shape {
    int side;

    Square(int side) {
        this.side = side;
    }

    public int getArea() {
        return this.side * this.side;
    }
}

class Circle implements Shape {
    int radius;
    float pi = 3.14f;

    Circle(int radius) {
        this.radius = radius;
    }

    public int getArea() {
        return (int)pi*this.radius*this.radius;
    }

    void showColor() {
        System.out.println("Color of circle is red.");
    }
}

public class StaticMethod {
    public static void main(String... args) {
        Shape s;
        s = new Square(4);
        s.getArea();
        // s.showColor(); // cannot be accessed 
        Shape.showColor();

        s = new Circle(7);
        s.getArea();
        // s.showColor(); // this also cannot be accessed as static method is not polymorphic

        Circle c = new Circle(7);
        c.showColor();
    }
}
