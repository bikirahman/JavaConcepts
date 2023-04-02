/*
This Java program demonstrates how to use threading in Java. 
It creates two threads by extending the Thread class (class A and class B), 
and one thread by implementing the Runnable interface (class C).

Class A represents a thread that sleeps for 2 seconds and then prints a message to the console. 
Class B represents a thread that immediately prints a message to the console. 
Class C represents a thread that also immediately prints a message to the console.

In the main method, an instance of each thread class is created and started. The thread created from class C is started by creating a new Thread instance and passing the instance of the class C object as an argument to the constructor. 
The threads created from class A and B are started by simply calling the start() method on each object.
*/
class A extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("A running.."); // Print message to console
    }
}

class B extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("B running.."); // Print message to console
    }
}

class C implements Runnable{

    @Override
    public void run() {
        System.out.println("C running"); // Print message to console
    }

}

public class ThreadingConcept {
    public static void main(String[] args) {
        A a = new A(); // Create instance of class A
        B b = new B(); // Create instance of class B

        C c = new C(); // Create instance of class C
        Thread t1 = new Thread(c); // Create new thread using instance of class C
        t1.start(); // Start thread t1

        a.start(); // Start thread a
        b.start(); // Start thread b
    }
}