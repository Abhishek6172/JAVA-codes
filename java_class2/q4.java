package JAVA.java_class2;
public class q4 {
    public static int count = 0;

    public q4() {
        count++; 
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        q4 obj1 = new q4();
        q4 obj2 = new q4();
        q4 obj3 = new q4();
        q4 obj4 = new q4();

        System.out.println("Number of objects created: " + q4.getCount());
    }
}