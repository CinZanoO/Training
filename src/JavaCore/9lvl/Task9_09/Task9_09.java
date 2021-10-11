package Tasks;

import java.io.*;

public class Task9_09 {
    public static void main(String[] args) throws IOException{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileReader  = new BufferedReader(new FileReader(reader.readLine()));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()))) {
                while(fileReader.ready()) {
                    int data = fileReader.read();
                    if(data == 46)
                        data = 33;
                    fileWriter.write(data);
                }
            }
    }
}
