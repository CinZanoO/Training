package Tasks;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Task1_01 {
    public static void main(String... args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(args[0], "rw");
        byte[] arrayOfBytes = args[2].getBytes();
        
        long number = Long.parseLong(args[1]);
        if(raf.length() < number) {
            raf.seek(raf.length());
            raf.write(arrayOfBytes);
        }
        else {
            raf.seek(number);
            raf.write(arrayOfBytes);
        }
    }
}
