package JAVA.java_class4;
class Apple {
    void show() {
        System.out.println("This is Apple class.");
    }
}
class Banana extends Apple {
    @Override
    void show() {
        System.out.println("This is Banana class.");
    }
}
class Cherry extends Apple {
    @Override
    void show() {
        System.out.println("This is Cherry class.");
    }
}
public class q3 {
    public static void main(String[] args) {
         Apple appleRef = new Apple();
        appleRef.show();
        appleRef = new Banana();
        appleRef.show();
        appleRef = new Cherry();
        appleRef.show();
    }
}
