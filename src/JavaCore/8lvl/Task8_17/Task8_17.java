package Tasks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Task8_17 {
    public static void main(String[] args) throws IOException{
        try(FileInputStream fileInputStream = new FileInputStream(args[1]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {
            if(args[0] == "-e") {
                while(fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read() + 1);
                }
            }
            else if(args[0] == "-d") {
                while (fileInputStream.available() > 0)
                fileOutputStream.write(fileInputStream.read() - 1);
                
            }
            else return;
        }
        catch(FileNotFoundException e){
        }
    }
}

