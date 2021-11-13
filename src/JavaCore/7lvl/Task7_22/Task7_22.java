package Tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class Task7_22 {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
    	Task7_22 solution = new Task7_22();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader readerFromFirstFile = new BufferedReader(new FileReader(reader.readLine()));
            BufferedReader readerFromSecondFile = new BufferedReader(new FileReader(reader.readLine()))) {
            while (readerFromFirstFile.ready()) {
                allLines.add(readerFromFirstFile.readLine());
            }
            while (readerFromSecondFile.ready()) {
                forRemoveLines.add(readerFromSecondFile.readLine());
            }
        }
        
        solution.joinData();
    }

    public void joinData() throws CorruptedDataException {
        boolean containsElements = true;
        for (String element : forRemoveLines) {
            if (allLines.contains(element))
                containsElements = true;
            else 
                containsElements = false;
        }
        
        if (containsElements == true) {
            for (String element : forRemoveLines)
                allLines.remove(element);
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}

