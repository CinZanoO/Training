package Tasks;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class Task1_02 {
    public static void main(String... args) throws IOException {
    	
        RandomAccessFile raf = new RandomAccessFile(args[0], "rw");
        long number = Long.parseLong(args[1]);
        int lengthOfText = args[2].length();
        byte[] arrayOfBytes = new byte[lengthOfText];
        
        raf.seek(number);
        raf.read(arrayOfBytes, 0, lengthOfText);
        
        byte[] arrayOfText = args[2].getBytes();
        byte[] trueText = "true".getBytes();
        byte[] falseText = "false".getBytes();
        
        if(Arrays.equals(arrayOfBytes, arrayOfText)) {
            raf.seek(raf.length());
            raf.write(trueText);
        }
        else {
            raf.seek(raf.length());
            raf.write(falseText);
        }
    }
}