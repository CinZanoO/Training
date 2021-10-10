

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class Task8_25 {
    public static void main(String[] args) throws IOException{
        int[] charCounter = new int[128];
        try(FileReader fileReader = new FileReader(args[0])) {
            while(fileReader.ready()) {
                charCounter[fileReader.read()]++;
            }
        }
            for(int i = 0; i < charCounter.length; i++) {
                if(charCounter[i] != 0)
                System.out.println((char) i + " " + charCounter[i]);
            }
    }
}
                