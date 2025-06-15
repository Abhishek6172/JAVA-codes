package JAVA.java_class1;
import java.util.Scanner;

public class q5 {
    public static void q5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Full Name: " + lastName +" "+ firstName);
   }
}
