package JAVA.java_class3;
import java.util.*;
class Student {
    int roll;
    String Name;
    double cgpa;
       
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
roll= sc.nextInt();
        System.out.print("Enter name: ");
Name= sc.next();
        System.out.print("Enter CGPA: ");
 cgpa= sc.nextDouble();
    }
    void display() {
        System.out.println("Roll: " + roll + ", Name: " + Name + ", CGPA: " + cgpa);
    }
}
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("Enter details of student " + (i + 1) + ":");
            students[i].read();
        }
        System.out.println("Details of Students:");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }
        double minCgpa = students[0].cgpa;
        String minCgpaName = students[0].Name;
        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < minCgpa) {
                minCgpa = students[i].cgpa;
                minCgpaName = students[i].Name;
            }
        }
        System.out.println("Student with the lowest CGPA: "+ minCgpaName + "(CGPA: "+ minCgpa +")");
    }
}
