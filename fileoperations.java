import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fileoperations {
    public static void main(String[] args) {
        Path path = Paths.get("test.txt");

        try {
           
            String contentToWrite = "Hello, Java!";
            Files.write(path, contentToWrite.getBytes());
            System.out.println("File written successfully.");

            String contentRead = new String(Files.readAllBytes(path));
            System.out.println("Read from file: " + contentRead);

            Files.deleteIfExists(path);
            System.out.println("File deleted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}