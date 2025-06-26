import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        String filename = "output.txt";

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello, this is a simple text.\n");
            writer.write("Writing to a file in Java is easy!");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
