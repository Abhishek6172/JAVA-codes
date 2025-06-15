package java_class10;
import java.util.*;

class ThreadTask implements Runnable {
    private final int lower;     
    private final int upper;
    private final String name;

    public ThreadTask(String name, int lower, int upper) {
        this.name = name;
        this.lower = lower;
        this.upper = upper;
    }

    public void run() {
        for (int i = lower; i <= upper; i++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class q11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit: ");
        int lower = sc.nextInt();
        System.out.println("Enter the upper limit: ");
        int upper = sc.nextInt();
        System.out.println("Enter the name: ");
        String name = sc.next();

        ThreadTask task = new ThreadTask(name, lower, upper); 
        Thread thread = new Thread(task); 
        thread.start();
    }
}
