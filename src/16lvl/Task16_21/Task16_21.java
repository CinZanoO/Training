package Tasks;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


public class Task16_21 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        
        URL url = new URL(line);
        InputStream inputStream = url.openStream();
        
        byte[] buffer = inputStream.readAllBytes();
        
        Path pathToFile = Files.createTempFile(null, null);
        Files.write(pathToFile, buffer);
    }
}