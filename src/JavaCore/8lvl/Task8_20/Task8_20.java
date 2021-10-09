package Tasks;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.io.FileNotFoundException;

public class Task8_20 {
	
    private static int countOfEnglishLetters;
    
    public static void main(String[] args) throws IOException{
        int[] indexOfEnglishLetters = new int[52];
        
        for(int i = 0; i < 26; i++)
            indexOfEnglishLetters[i] = i + 65;
        
        for(int j = 26; j < indexOfEnglishLetters.length; j++)
            indexOfEnglishLetters[j] = j + 71;
        
        try(FileReader fileReader = new FileReader(args[0])) {
            while(fileReader.ready()) {
                if(Arrays.binarySearch(indexOfEnglishLetters, fileReader.read()) >= 0) 
                countOfEnglishLetters++;
            }
        } catch(FileNotFoundException e){
        }
        System.out.println(countOfEnglishLetters);
    }
}