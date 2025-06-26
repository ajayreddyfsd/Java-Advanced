import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        String filename = "example.txt";  // Make sure this file exists

        try (FileReader reader = new FileReader(filename)) {
            int ch;
            // Read one character at a time until end of file (-1)
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);  // Cast int to char to print
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
