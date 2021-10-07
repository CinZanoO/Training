package Tasks;

import java.io.*;
import java.util.Arrays;

public class Task8_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceName = reader.readLine();
        String purposeName1 = reader.readLine();
        String purposeName2 = reader.readLine();
        
        byte[] byteBuffer = new byte[1000];
        
        try(FileInputStream fileInputStream = new FileInputStream(sourceName);
            FileOutputStream fileOutputStream1 = new FileOutputStream(purposeName1);
            FileOutputStream fileOutputStream2 = new FileOutputStream(purposeName2)) {
            while(fileInputStream.available() > 0) {
                int count = fileInputStream.read(byteBuffer);
                
                if (count % 2 == 0) {
                    byte[] copyFirstHalf = new byte[count / 2];
                    byte[] copySecondHalf = new byte[count / 2];
                    
                    copyFirstHalf = Arrays.copyOfRange(byteBuffer, 0, count / 2);
                    copySecondHalf = Arrays.copyOfRange(byteBuffer, count / 2, count);
                    
                    fileOutputStream1.write(copyFirstHalf);
                    fileOutputStream2.write(copySecondHalf);
                }
                
                else {
                    byte[] copyFirstHalf = new byte[count / 2 + 1];
                    byte[] copySecondHalf = new byte[count / 2];
                    
                    copyFirstHalf = Arrays.copyOfRange(byteBuffer, 0, count / 2 + 1);
                    copySecondHalf = Arrays.copyOfRange(byteBuffer, count / 2 + 1, count);
                    
                    fileOutputStream1.write(copyFirstHalf);
                    fileOutputStream2.write(copySecondHalf);
                }
            }
        }
    }
}
