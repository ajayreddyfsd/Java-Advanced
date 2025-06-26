import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.IOException;

public class FilesNewBufferedReaderExample {
    public static void main(String[] args) {
        // Files.newBufferedReader gives a BufferedReader for efficient line-by-line reading
        // Good for large files or when you want to specify character encoding easily
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);  // process each line one by one
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
