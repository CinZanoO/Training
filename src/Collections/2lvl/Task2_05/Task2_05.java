package Tasks;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/* 
Шифр Цезаря
*/

public class Task2_05 {
	public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        System.out.println(decode(reader, -3));  //Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) throws IOException {
        StringWriter writer = new StringWriter();
        if(reader != null) {
            int nextChar = 0;
            while(true) {
                nextChar = reader.read();
                if(nextChar < 0) 
                    break;
                writer.write(nextChar + key);
                String resultT = writer.toString();
                System.out.println(resultT);
            }
        }
            String result = writer.toString();
            return result;
    }
}