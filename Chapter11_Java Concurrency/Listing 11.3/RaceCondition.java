/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

// This class exposes a publicly accessible counter 
// to help demonstrate race condition problem
class Counter {
    public static long count = 0;
}

// This class implements Runnable interface 
// Its run method increments the counter three times 
class UseCounter implements Runnable {
    public void increment() {
        // increments the counter and prints the value 
        // of the counter shared between threads
        Counter.count++;
        System.out.print(Counter.count + "  ");
    }
    public void run() {
        increment();
        increment();
        increment();
    }
}

// This class creates three threads 
public class RaceCondition {
    public static void main(String args[]) {
        UseCounter c = new UseCounter();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);
        t1.start();
        t2.start();
        t3.start();
    }
}

