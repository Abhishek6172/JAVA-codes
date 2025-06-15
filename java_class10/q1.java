package java_class10;
import java.util.*;
class thread extends Thread {
    private final int lower;
    private final int upper;

    public thread(String name, int lower, int upper) {
        super(name); 
        this.lower = lower;
        this.upper = upper;
    }
    public void run() {
        for (int i = lower; i <= upper; i++) {
            System.out.println(getName() + ": " + i);
            try {
                Thread.sleep(5); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit: ");
        int lower = sc.nextInt();
        System.out.println("Enter the upper limit: ");
        int  upper= sc.nextInt();
        System.out.println("Enter the name:-");
        String name = sc.next();
        thread thread = new thread(name, lower, upper);
        thread.start();
    }
}
