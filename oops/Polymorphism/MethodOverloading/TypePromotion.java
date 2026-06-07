package oops.Polymorphism.MethodOverloading;

/*
byte can be promoted to short, int, long, float or double. 
The short datatype can be promoted to int, long, float or double. 
The char datatype can be promoted to int,long,float or double and so on.
 */
class Operations {
    void sum(int a, long b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void subtract(int a, int b) {
        System.out.println(a - b);
    }

    void subtract(long a, long b) {
        System.out.println(a - b);
    }

    void multiply(int a, long b) {
        System.out.println(a * b);
    }

    void multiply(long a, int b) {
        System.err.println(a * b);
    }
}

public class TypePromotion {
    public static void main(String []args) {
        Operations op = new Operations();
        op.sum(20, 30);
        op.sum(10, 20, 30);

        op.subtract(23, 15);
        op.subtract(232, 8274);

        // op.multiply(13, 4); // creates ambiguity
    }
}
