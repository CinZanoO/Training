package Tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Task5_29 {
    public static void main(String[] args) {
        List<Integer> evenNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        String pathToTheFile = scanner.nextLine();
        
        try(BufferedReader reader = new BufferedReader(new InputStreamReader (new FileInputStream(pathToTheFile)))) {
        	while(reader.ready()) {
                    int nextNumber = Integer.parseInt(reader.readLine());
                    
                    if(nextNumber % 2 == 0)
                        evenNumbers.add(nextNumber);
        	}
        
            
            
            Collections.sort(evenNumbers);
            for (Integer number : evenNumbers)
                System.out.println(number);
        } catch (IOException e) {
        	e.printStackTrace();
        }
     }
}
