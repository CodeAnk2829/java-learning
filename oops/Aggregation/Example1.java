package oops.Aggregation;

/*
- Aggregation refers to 'Has-A' relationship
- Where an object uses another object as a part of its functionality
*/

/*
Note: Inheritance should be used only if the relationship is-a is maintained 
throughout the lifetime of the objects involved; otherwise, aggregation is the best choice.
*/

class Operation {
    int sqaure(int n) {
        return n*n;
    }
}

class Circle {
    double pi = 3.14;
    Operation op;
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    double area() {
        this.op = new Operation();
        int rSquare = this.op.sqaure(this.radius);
        return pi*rSquare;
    }
}

public class Example1 {
    public static void main(String args[]) {
        Circle c = new Circle(7);
        double result = c.area();
        System.out.println(result);
    }
}