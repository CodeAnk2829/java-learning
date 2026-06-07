package oops.Abstraction.Interface;

/*
- An interface can be declared inside another interface. Such interfaces are called nested interfaces. 
- A class can implement the outer interface, the nested interface, or both, depending on the requirement.
*/

interface Runnable { // outer interface
    void run();

    interface RunnableProgram { // nested interface
        void execute();
    }
}

class Stream implements Runnable {
    public void run() {
        System.out.println("Running the stream...");
    }
}

class Chain implements Runnable.RunnableProgram {
    public void execute() {
        System.out.println("Execution of chain has been started");
    }
}

public class NestedInterface {
    public static void main(String... args) {
        Runnable runnableStream = new Stream();
        runnableStream.run();

        Runnable.RunnableProgram chain = new Chain();
        chain.execute();
    }
}
