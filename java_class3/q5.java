package JAVA.java_class3;

import java.util.*;
class Shape {
    double area(double radius) {
        return 3.14 * radius * radius;
    }
    double area(double base, double height) {
        return 0.5 * base * height;
    }
    double area(int side) {
        return side * side;
    }
}
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape obj = new Shape();

        System.out.println("Choose the shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.print("Enter your choice:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                double cirArea = obj.area(radius);
                System.out.println("Area of the circle: " + cirArea);
                break;
            case 2:
                System.out.print("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                double triArea = obj.area(base, height);
                System.out.println("Area of the triangle: " + triArea);
                break;
            case 3:
                System.out.print("Enter the side length of the square: ");
                int side = sc.nextInt();
                double sqArea = obj.area(side);
                System.out.println("Area of the square: " + sqArea);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
