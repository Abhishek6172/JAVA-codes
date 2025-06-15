
interface Motor {
    int capacity = 10;
    void run();
    void consume();
}
class WashingMachine implements Motor {
    public void run() {
        System.out.println("Washing Machine is running...");
    }
    public void consume() {
        System.out.println("Washing Machine is consuming electricity...");
    }
    void showCapacity() {
        System.out.println("Washing Machine Capacity: " + capacity + " liters");
    }
}
public class q2 {
    public static void main(String[] args) {
        WashingMachine obj1 = new WashingMachine();
        obj1.run();
        obj1.consume();
        obj1.showCapacity();
    }
}
