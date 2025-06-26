import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.util.Arrays;

public class FilesWriteExample {
    public static void main(String[] args) {
        // Files.write writes all lines to a file at once
        // Easy and clean for writing small to medium text files
        // Supports creating or overwriting files with simple options
        try {
            Files.write(Paths.get("output.txt"),
                        Arrays.asList("Hello, world!", "This line is written using Files.write()"),
                        StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
