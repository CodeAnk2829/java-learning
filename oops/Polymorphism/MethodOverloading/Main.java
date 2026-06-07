package oops.Polymorphism.MethodOverloading;

/*
- Method signature includes method name and parameter lists
- Method overloading can be achieved by changing the number of arguments or 
  changing the datatype of arguments
*/

class Adder {
    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    static double add(double num1, double num2) {
        return num1 + num2;
    }
}

public class Main {
    public static void main(String args[]) {
        int addTwoNumbers = Adder.add(4, 5);
        int addThreeNumbers = Adder.add(4, 5, 6);
        double addDecimals = Adder.add(3.14, 8.48);

        System.out.println(addTwoNumbers);
        System.out.println(addThreeNumbers);
        System.out.println(addDecimals);
    }
}
