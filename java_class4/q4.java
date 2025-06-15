package JAVA.java_class4;
import java.util.*;
class Account {
    int acc_no;
    double balance;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        acc_no = scanner.nextInt();
        System.out.print("Enter Balance: ");
        balance = scanner.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;
    void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Aadhar Number: ");
        aadhar_no = scanner.nextLine();
    }
    void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class q4 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];

        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
            System.out.println("Enter details for person " + (i + 1) + ":");
            persons[i].input();
            System.out.println();
        }
        System.out.println("Details of all persons:");
        for (Person person : persons) {
            person.disp();
            System.out.println();
        }
    }
}
