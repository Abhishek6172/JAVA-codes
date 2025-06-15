package java_class8;
import java.io.*;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the source file name: ");
        String sourceFile = sc.nextLine();

        System.out.print("Enter the destination file name: ");
        String destinationFile = sc.nextLine();

        try (FileReader fr = new FileReader(sourceFile);
             FileWriter fw = new FileWriter(destinationFile)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            System.out.println("File copied using character stream.");
        } catch (IOException e) {
            System.out.println("Error with character stream: " + e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied using byte stream.");
        } catch (IOException e) {
            System.out.println("Error with byte stream: " + e.getMessage());
        }

        sc.close();
    }
}
