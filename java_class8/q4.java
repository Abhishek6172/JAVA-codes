package java_class8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the file: ");
        String fileName = scanner.nextLine();

        int characterCount = 0;
        int lineCount = 0;
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++; // Count each line
                characterCount += line.length();

                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }

            System.out.println("No. of characters = " + characterCount);
            System.out.println("No. of lines = " + lineCount);
            System.out.println("No. of words = " + wordCount);

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}