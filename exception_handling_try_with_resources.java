// 🤔 What Problem Are We Solving?
// When you use resources like:
// files (FileReader, BufferedReader)
// network connections
// database connections
// ...you need to close them when done, or they stay open and waste memory or cause errors.

import java.io.*;

public class SimpleTryWithResources {
    public static void main(String[] args) {
        // Reader is automatically closed after try block
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line = reader.readLine();
            System.out.println("First line: " + line);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Done!");
    }
}
