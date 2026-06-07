package oops.Polymorphism.MethodOverloading;

/*
The main() method can be overloaded in Java which is technically correct. 
But, it won't be considered as the entry point for the Java Virtual Machine (JVM)
to start the execution of the program. While overloading the main() method is syntactically 
valid, it does not serve the purpose of being the entry point for program execution.

The JVM expects the standard signature public static void main(String[] args) for the entry point.
Any other overloaded main() method will be treated as a regular method and will not be invoked by
the JVM to start the program.
*/
public class MainOverloading {
    public static void main(String[] args) {
        System.out.println("Main method called by JVM");
    }

    public static void main() {
        System.out.println("Main method without command line arguments");
    }

    public static void main(String args) {
        System.out.println("Main method with only one command line argument");
    }
}
