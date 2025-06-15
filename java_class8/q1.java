package java_class8;
import java.io.*;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter file name to save details: ");
            String fileName = sc.nextLine();

            try (BufferedWriter w = new BufferedWriter(new FileWriter(fileName, true))) {
                w.write(rollNo + "," + name + "," + subject + "," + marks);
                w.newLine();
                System.out.println("Details saved to file.");
            }

            System.out.println("\nContents of the file:");
            try (BufferedReader r = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = r.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
