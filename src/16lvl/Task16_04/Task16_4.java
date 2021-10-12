package Tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task16_4 {
	public static void main(String[] args) throws IOException {
		try(Scanner scanner = new Scanner(System.in);
		           var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
		           var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine())))
		           {

		int variable = 0;
        int countOfBytes = inputStream.available();
    
            if(countOfBytes % 2 == 0) {
                while(inputStream.available() > 0) {
                	
                    int firstByte = inputStream.read();
                    int secondByte = inputStream.read();
                    
                    variable = firstByte;
                    firstByte = secondByte;
                    secondByte = variable;
                    
                    outputStream.write(firstByte);
                    outputStream.write(secondByte);
                }
            }
            else {
                while(inputStream.available() > 0) {
                	
                    if(inputStream.available() == 1) {
                    	outputStream.write(inputStream.read());
                    	break;
                    }
                    
                    int firstByte = inputStream.read();
                    int secondByte = inputStream.read();
                    
                    variable = firstByte;
                    firstByte = secondByte;
                    secondByte = variable;
                    
                    outputStream.write(firstByte);
                    outputStream.write(secondByte);
                }
            }
		 }
	}
}

