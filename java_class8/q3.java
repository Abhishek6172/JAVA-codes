package java_class8;

import java.io.FileInputStream;
import java.io.IOException;

public class q3 
{

    public static void main(String[] args) {
        String file1 = "sourcefile.txt";
        String file2 = "destinationfile.txt";

        try {
            compareFiles(file1, file2);
        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
    }

    public static void compareFiles(String filePath1, String filePath2) throws IOException {
        try (FileInputStream fis1 = new FileInputStream(filePath1);
             FileInputStream fis2 = new FileInputStream(filePath2)) {

            int byte1, byte2;
            int position = 1;

            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {
                if (byte1 != byte2) {
                    System.out.println("Two files are not equal: byte position at which two files differ is " + position);
                    return;
                }
                position++;
            }

            if (fis1.read() == -1 && fis2.read() == -1) {
                System.out.println("Two files are equal");
            } else {
                System.out.println("Two files are not equal: byte position at which two files differ is " + position);
            }
        }
    }
}