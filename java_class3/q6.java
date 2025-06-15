package JAVA.java_class3;
import java.util.*;
class Area{
    double length, breadth;
    Area() {
        length = 0;
        breadth = 0;
    }
    Area(double l, double b) {
        length = l;
        breadth = b;
    }
    double area() {
        return length * breadth;
    }
    void display() {
        System.out.println("Length: " + length + ", Breadth: " + breadth);
        System.out.println("Area: " + area());
    }
}
public class q6 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Area rect1 = new Area();
        Area rect2 = new Area(5,5);
        System.out.println("Enter the length and breadth of rectangle 2: ");
        //rect2.length = sc.nextDouble();
        //rect2.breadth = sc.nextDouble();
        System.out.println("Area with default constructor: " + rect1.area());
        System.out.println("Area with parameterised constructor: " + rect2.area());
    }
}