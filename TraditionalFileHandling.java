import java.io.File;[cite: 2]
import java.io.FileWriter;[cite: 2]
import java.io.FileReader;[cite: 2]
import java.io.BufferedReader;[cite: 2]
import java.io.IOException;[cite: 2]

public class IOstreamfileOp {[cite: 2]
    public static void main(String[] args) {[cite: 2]
        String fileName = "io_test.txt";[cite: 2]

        try {[cite: 2]

            try (FileWriter writer = new FileWriter(fileName)) {[cite: 2]
                writer.write("Hello using java IO streams!");[cite: 2]
                System.out.println("File written Successfully");[cite: 2]
            }[cite: 2]

            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {[cite: 1]
                String content = reader.readLine();[cite: 1]
                System.out.println("Read from file: " + content);[cite: 1]
            }[cite: 1]

            File file = new File(fileName);[cite: 1]
            if (file.delete()) {[cite: 1]
                System.out.println("File deleted Successfully..");[cite: 1]
            }[cite: 1]

        } catch (IOException e) {[cite: 1]
            e.printStackTrace();[cite: 1]
        }[cite: 1]
    }[cite: 1]
}[cite: 1]
